package com.horo.demohoroscope.Repository.temptDB;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.horo.demohoroscope.entity.tables.dailyTable;


@Repository
public interface dailyHoroscopeRepository extends JpaRepository<dailyTable, Long> {

  Optional<dailyTable> findByHoroscopeNameAndDate(String horoscopeName, LocalDate date);
  
}
