package com.horo.demohoroscope.controller.Impl.Impl;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horo.demohoroscope.Service.WebCrawlerServiceImpl;
import com.horo.demohoroscope.controller.HoroScopeController;


@RestController
@RequestMapping(value = "/api/v8")
public class HoroscopeControllerImp implements HoroScopeController {
  
  @Autowired
  WebCrawlerServiceImpl webCrawlerServiceImpl;

  @Override
  public String getZodaicPrediction(String description, LocalDate date) {
    return webCrawlerServiceImpl.getZodaicPrediction(description,date);
  }

  @Override
  public String getHoroscopePrediction(String description, LocalDate date) {
  return webCrawlerServiceImpl.getHoroscopePrediction(description,date);

  }
}
