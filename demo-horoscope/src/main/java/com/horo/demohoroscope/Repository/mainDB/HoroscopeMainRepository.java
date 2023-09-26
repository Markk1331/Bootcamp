package com.horo.demohoroscope.Repository.mainDB;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.horo.demohoroscope.entity.tables.backUpdailyTable;



@Repository
public interface HoroscopeMainRepository extends JpaRepository<backUpdailyTable, Long> {

  Optional<backUpdailyTable> findByHoroscopeNameAndDate(String horoscopeName, LocalDate date);
  
}
