package com.hkjava.demo.demofinnhub.service;

import java.util.List;

import com.hkjava.demo.demofinnhub.entity.Stock;
import com.hkjava.demo.demofinnhub.exception.FinnhubException;
import com.hkjava.demo.demofinnhub.model.CompanyProfile;

public interface CompanyService {
  
  CompanyProfile getCompanyProfile(String symbol) throws FinnhubException;

  Stock save(Stock stock);

  void deleteById(Long id);

  void deleteAll();

  List<Stock> findAll();

  void updateById(Long id, Stock stock); 

  void updateCompanyNameById(Long id, String companyName);

  Stock getStocks(Long id); 


}
