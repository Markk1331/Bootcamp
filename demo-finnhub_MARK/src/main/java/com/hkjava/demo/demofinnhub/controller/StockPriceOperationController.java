package com.hkjava.demo.demofinnhub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hkjava.demo.demofinnhub.entity.StockPrice;

public interface StockPriceOperationController {
  @PostMapping("/data/stock/{id}/price")
  @ResponseStatus(value = HttpStatus.OK)
  StockPrice save(@PathVariable long id, @RequestBody StockPrice stockp);
}
