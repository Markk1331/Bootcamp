package com.hkjava.demo.demofinnhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.hkjava.demo.demofinnhub.entity.Stock;
import java.util.List;


@Repository
public interface StockRepository extends JpaRepository<Stock, Long> { //one table

  // select * from table where company_name = "";
 List<Stock> findByCompanyName(String companyName);

 
 //List<Stock>  findFirst3ByCountryAndMarketCapGreaterThanEqualOrderByIdDesc (String companyName);

 //@Query( value = "select s.id, s.country, s.company....wheres.id = id, nativelyQuery = true")
// List<Stock> findAllById2(@Param(value = "id") Long id);
// @Query( value = "select s from finnhub_stocks s where s.id = :")

  
}
