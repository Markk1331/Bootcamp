package com.horo.demohoroscope.entity.tables;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "daily_Chinese_Predictions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ChineseHTable {
     @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id;

    @Column(name = "Chinese_horoscope_name", length = 50)
    private String chineseHName;

    @Column(name = "Chinese_horoscope_daily_description", length = 1000)
    private String desciption;

    @Column(name = "created_at")
    private LocalDate date;
  
}


