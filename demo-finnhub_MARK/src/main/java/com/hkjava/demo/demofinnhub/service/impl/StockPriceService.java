package com.hkjava.demo.demofinnhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hkjava.demo.demofinnhub.entity.Stock;
import com.hkjava.demo.demofinnhub.entity.StockPrice;
import com.hkjava.demo.demofinnhub.repository.StockPriceRepository;
import com.hkjava.demo.demofinnhub.repository.StockRepository;
import com.hkjava.demo.demofinnhub.service.StockPriceServicelmp;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StockPriceService implements StockPriceServicelmp{

@Autowired
StockPriceRepository stockPriceRepository;

  @Autowired
  StockRepository stockRepository;

  @Override
   public StockPrice save(long id, StockPrice stockp){
    Stock stock = stockRepository.findById(id) //
        .orElseThrow(
            () -> new EntityNotFoundException("Entity Stock ID not Found"));
    stockp.setStock(stock);
    return stockPriceRepository.save(stockp);
  
  }
}