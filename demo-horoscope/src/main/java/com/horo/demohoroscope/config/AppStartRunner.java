package com.horo.demohoroscope.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.horo.demohoroscope.Repository.temptDB.dailyHoroscopeRepository;
import com.horo.demohoroscope.Service.Impl.WebCrawlerService;
import com.horo.demohoroscope.entity.tables.dailyTable;
import com.horo.demohoroscope.model.crawler.JsoupCrawler;
import com.horo.demohoroscope.saver.SaveDB;

@Component
public class AppStartRunner implements CommandLineRunner {

  @Autowired
  WebCrawlerService webCrawlerService;

  @Autowired
  SaveDB saveDB;

  @Override
  public void run(String... args) throws Exception {
  webCrawlerService.clear();

  saveDB.retrieveAndSaveHoroscope("Aries", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=1");
  saveDB.retrieveAndSaveHoroscope("Taurus", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=2");
  saveDB.retrieveAndSaveHoroscope("Gemini", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=3");
  saveDB.retrieveAndSaveHoroscope("Cancer", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=4");
  saveDB.retrieveAndSaveHoroscope("Leo", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=5");
  saveDB.retrieveAndSaveHoroscope("Virgo", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=6");
  saveDB.retrieveAndSaveHoroscope("Libra", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=7");
  saveDB.retrieveAndSaveHoroscope("Scorpio", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=8");
  saveDB.retrieveAndSaveHoroscope("Sagittarius", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=9");
  saveDB.retrieveAndSaveHoroscope("Capricorn", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=10");
  saveDB.retrieveAndSaveHoroscope("Aquarius", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=11");
  saveDB.retrieveAndSaveHoroscope("Pisces", "https://www.horoscope.com/us/horoscopes/general/horoscope-general-daily-today.aspx?sign=12");

  saveDB.retrieveAndSaveChineseHoroscope("Rat", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=3");
  saveDB.retrieveAndSaveChineseHoroscope("Ox", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=1");
  saveDB.retrieveAndSaveChineseHoroscope("Tiger", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=6");
  saveDB.retrieveAndSaveChineseHoroscope("Rabbit", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=7");
  saveDB.retrieveAndSaveChineseHoroscope("Dragon", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=5");
  saveDB.retrieveAndSaveChineseHoroscope("Snake", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=4");  
  saveDB.retrieveAndSaveChineseHoroscope("Horse", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=8");
  saveDB.retrieveAndSaveChineseHoroscope("Goat", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=2");
  saveDB.retrieveAndSaveChineseHoroscope("Monkey", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=9");
  saveDB.retrieveAndSaveChineseHoroscope("Rooster", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=10");
  saveDB.retrieveAndSaveChineseHoroscope("Dog", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=11");
  saveDB.retrieveAndSaveChineseHoroscope("Pig", "https://www.horoscope.com/us/horoscopes/chinese/horoscope-chinese-daily-today.aspx?sign=12");


}


  
}
