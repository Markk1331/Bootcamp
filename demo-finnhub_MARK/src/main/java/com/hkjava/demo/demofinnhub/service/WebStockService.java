package com.hkjava.demo.demofinnhub.service;

import java.util.List;

import com.hkjava.demo.demofinnhub.entity.Stock;
import com.hkjava.demo.demofinnhub.exception.FinnhubException;
import com.hkjava.demo.demofinnhub.model.dto.StockDTO;

public interface WebStockService {
  
  StockDTO stockInfo(String symbol) throws FinnhubException;


}
