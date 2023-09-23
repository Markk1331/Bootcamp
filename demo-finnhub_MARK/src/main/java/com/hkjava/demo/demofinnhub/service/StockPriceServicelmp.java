package com.hkjava.demo.demofinnhub.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.hkjava.demo.demofinnhub.entity.StockPrice;
import com.hkjava.demo.demofinnhub.exception.FinnhubException;

public interface StockPriceServicelmp {
  StockPrice save(long id, StockPrice stockPrice) throws FinnhubException;
}
