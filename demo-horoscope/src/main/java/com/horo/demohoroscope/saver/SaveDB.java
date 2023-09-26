package com.horo.demohoroscope.saver;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.horo.demohoroscope.Repository.temptDB.dailyChineseRepository;
import com.horo.demohoroscope.Repository.temptDB.dailyHoroscopeRepository;
import com.horo.demohoroscope.Service.Impl.WebCrawlerService;
import com.horo.demohoroscope.entity.tables.ChineseHTable;
import com.horo.demohoroscope.entity.tables.dailyTable;
import com.horo.demohoroscope.model.crawler.JsoupCrawler;

@Component
public class SaveDB {

  @Autowired
  WebCrawlerService webCrawlerService;

  @Autowired
  dailyHoroscopeRepository dailyhoroscopeRepository;

  @Autowired
  dailyChineseRepository dailyChineseRepository;


  public void retrieveAndSaveHoroscope(String signName, String url) {
    String horoscope = JsoupCrawler.retrieveHoroscope(url);
    dailyTable savedHoroscope = dailyhoroscopeRepository.save(dailyTable.builder()
            .desciption(horoscope)
            .horoscopeName(signName)
            .date(LocalDate.now())
            .build());
    webCrawlerService.save(savedHoroscope, signName);
}


 public void retrieveAndSaveChineseHoroscope(String signName, String url){
      String horoscope = JsoupCrawler.retrieveHoroscope(url);
    ChineseHTable savedHoroscope = dailyChineseRepository.save(ChineseHTable.builder()
            .desciption(horoscope)
            .chineseHName(signName)
            .date(LocalDate.now())
            .build());
    webCrawlerService.ChineseSave(savedHoroscope, signName);

 }
}
