package com.horo.demohoroscope.Service.Impl;


import java.time.LocalDate;

import com.horo.demohoroscope.entity.tables.ChineseHTable;
import com.horo.demohoroscope.entity.tables.dailyTable;
// import com.horo.demohoroscope.entity.user.Users;


public interface WebCrawlerService {
  void save(dailyTable horoscope, String description);

  void ChineseSave(ChineseHTable horoscope, String description);

  void clear();

  String getZodaicPrediction(String ChineseName, LocalDate date);

  String getHoroscopePrediction(String horoscope, LocalDate date);

  // void saveUserinfo(Users user);

}