package com.hkjava.demo.demofinnhub.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.hkjava.demo.demofinnhub.entity.Stock;
import com.hkjava.demo.demofinnhub.entity.StockPrice;
import com.hkjava.demo.demofinnhub.entity.StockSymbol;
import com.hkjava.demo.demofinnhub.exception.FinnhubException;
import com.hkjava.demo.demofinnhub.infra.BusinessException;
import com.hkjava.demo.demofinnhub.model.CompanyProfile;
import com.hkjava.demo.demofinnhub.model.Quote;
import com.hkjava.demo.demofinnhub.model.Symbol;
import com.hkjava.demo.demofinnhub.model.mapper.FinnhubMapper;
import com.hkjava.demo.demofinnhub.repository.StockPriceRepository;
import com.hkjava.demo.demofinnhub.repository.StockRepository;
import com.hkjava.demo.demofinnhub.repository.SymbolRepository;
import com.hkjava.demo.demofinnhub.service.CompanyService;
import com.hkjava.demo.demofinnhub.service.StockService;
import com.hkjava.demo.demofinnhub.service.StockSymbolService;
import com.hkjava.demo.demofinnhub.service.impl.StockPriceService;
import com.hkjava.demo.demofinnhub.service.impl.StockServiceImpl;


@Profile("!test")
@Component
public class AppStartRunner implements CommandLineRunner {



  @Autowired
  private StockSymbolService stockSymbolService;
  @Autowired
  private CompanyService companyService;
  @Autowired
  private StockRepository stockRepository;
  @Autowired
  private StockPriceRepository stockPriceRepository;

  @Autowired
  private FinnhubMapper finnhubMapper;

  @Autowired
  StockServiceImpl stockService;

  @Override
  public void run(String... args) throws FinnhubException {

    // Before Server Start:
    // 0. Get all symbols (US) from the below API.
    // https://finnhub.io/api/v1/stock/symbol?exchange=US&token=?
    // 0. Create one more Entity StockSymbol
    // Clear the tables
    stockPriceRepository.deleteAll();
    companyService.deleteAll();
    stockSymbolService.deleteAll();

    // Call API to get all symbols
    List<Symbol> symbols = stockSymbolService.getAllSymbols();
    System.out.println("All Symbols are inserted.");
    // 1. Save all symbols
    stockSymbolService.save(symbols).stream() //
        .limit(10L) // 10 stocks
        .forEach(symbol -> {
          try {
            // 2. Get Compnay Profile 2 and insert into database
            CompanyProfile companyProfile =
                companyService.getCompanyProfile(symbol.getSymbol());
            Stock stock = finnhubMapper.map(companyProfile);
            stock.setStockSymbol(symbol);
            Stock storedStock = stockRepository.save(stock);
            System.out.println("completed symbol=" + symbol.getSymbol());
            
            // 3. Get Stock price and insert into database
            Quote quote = stockService.getQuote(symbol.getSymbol());
            StockPrice stockPrice = finnhubMapper.map(quote);
            stockPrice.setStock(storedStock);
            stockPriceRepository.save(stockPrice);
            System.out.println("completed symbol=" + symbol.getSymbol());
          } catch (FinnhubException e) {
            System.out
                .println("RestClientException: Symbol" + symbol.getSymbol());
          }
        });
    System.out.println("10 Stocks are inserted.");
    System.out.println("CommandLineRunner Completed");
  }

}