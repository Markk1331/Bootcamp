package com.horo.demohoroscope.controller;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public interface HoroScopeController {

  @GetMapping(value = "/zodaic")
   String getZodaicPrediction(@RequestParam("sign") String sign, @RequestParam("date") LocalDate date);

  @GetMapping(value = "/horoscope")
   String getHoroscopePrediction(@RequestParam("sign") String sign, @RequestParam("date") LocalDate date);


}
