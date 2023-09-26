package com.horo.demohoroscope.Repository.mainDB;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.horo.demohoroscope.entity.tables.backUpChineseHTable;


@Repository
public interface ChineseMainRepository extends JpaRepository<backUpChineseHTable, Long> {
    Optional<backUpChineseHTable> findByChineseHNameAndDate(String chineseHName, LocalDate date);
}