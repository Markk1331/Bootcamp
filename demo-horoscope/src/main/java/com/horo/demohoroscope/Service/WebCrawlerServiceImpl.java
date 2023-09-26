package com.horo.demohoroscope.Service;


import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.horo.demohoroscope.Service.Impl.WebCrawlerService;
import com.horo.demohoroscope.entity.tables.ChineseHTable;
import com.horo.demohoroscope.entity.tables.backUpChineseHTable;
import com.horo.demohoroscope.entity.tables.backUpdailyTable;
import com.horo.demohoroscope.entity.tables.dailyTable;
// import com.horo.demohoroscope.entity.user.Users;

import jakarta.persistence.EntityNotFoundException;

// import com.horo.demohoroscope.Repository.UsersRepository;
import com.horo.demohoroscope.Repository.mainDB.ChineseMainRepository;
import com.horo.demohoroscope.Repository.mainDB.HoroscopeMainRepository;
import com.horo.demohoroscope.Repository.temptDB.dailyChineseRepository;
import com.horo.demohoroscope.Repository.temptDB.dailyHoroscopeRepository;


@Service
public class WebCrawlerServiceImpl implements WebCrawlerService{

  @Autowired
  dailyHoroscopeRepository dailyhoroscopeRepository;

  @Autowired
  dailyChineseRepository dailychineseRepository;

  @Autowired
  ChineseMainRepository chineseMainDB;

  @Autowired
  HoroscopeMainRepository horoscopeMainRepository;

  // @Autowired
  // UsersRepository usersRepository;



   @Override
  public void save(dailyTable horoscope, String description) {
    dailyhoroscopeRepository.save(horoscope);
  }

   @Override
  public void ChineseSave(ChineseHTable horoscope, String description) {
   dailychineseRepository.save(horoscope);
  }

  @Override
  public void clear() {
    dailyhoroscopeRepository.deleteAll();
  }


  @Override
  public String getZodaicPrediction(String ChineseName, LocalDate date) {
      Optional<backUpChineseHTable> optionalChineseZodaic = chineseMainDB
          .findByChineseHNameAndDate(ChineseName, date);
      backUpChineseHTable ChineseZodaic = optionalChineseZodaic.orElseThrow(() ->
          new EntityNotFoundException("Zodiac sign not found for the provided date"));
      return ChineseZodaic.getDesciption();
  }

  @Override
  public String getHoroscopePrediction(String horoscope, LocalDate date) {
    Optional<backUpdailyTable>  optionaldailytable = horoscopeMainRepository
    .findByHoroscopeNameAndDate(horoscope, date);
    backUpdailyTable main2 = optionaldailytable.orElseThrow(() -> new EntityNotFoundException("Zodiac sign not found for the provided date"));
    return main2.getDesciption();
  }

  // @Override
  // public void saveUserinfo(Users user) {
  //  usersRepository.save(user);
  // }
}
