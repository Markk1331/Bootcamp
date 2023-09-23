package com.hkjava.demo.demofinnhub.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkjava.demo.demofinnhub.controller.StockPriceOperationController;
import com.hkjava.demo.demofinnhub.entity.StockPrice;
import com.hkjava.demo.demofinnhub.service.impl.StockPriceService;

@RestController
@RequestMapping(value = "/api/v1")
public class StockPriceOperation implements StockPriceOperationController{

  @Autowired
  StockPriceService stockPriceService;

  @Override
  public StockPrice save(long id, StockPrice stockp){
    return stockPriceService.save(id, stockp);
  }
}
