package com.horo.demohoroscope.Repository.temptDB;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.horo.demohoroscope.entity.tables.ChineseHTable;

@Repository
public interface dailyChineseRepository extends JpaRepository<ChineseHTable, Long> {
    Optional<ChineseHTable> findByChineseHNameAndDate(String chineseHName, LocalDate date);
}
