package com.horo.demohoroscope.config.dataTransfer;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.horo.demohoroscope.config.AppStartRunner;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Component
@EnableScheduling
public class SchedulerTaskConfig {
    private final EntityManager entityManager;

    public SchedulerTaskConfig(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Scheduled(cron = "0 15 3 * * *") // Runs at 3 olcok
    @Transactional
    public void transferData() {
        String sql = "INSERT INTO daily_Predictions_backup SELECT * FROM daily_Predictions";
        entityManager.createNativeQuery(sql).executeUpdate();

        String sql2 = "INSERT INTO daily_Chinese_Predictions_backup SELECT * FROM daily_Chinese_Predictions";
        entityManager.createNativeQuery(sql2).executeUpdate();
    }

    @Scheduled(fixedRate = 24 * 60 * 60 * 1000) // Run once every day (24 hours * 60 minutes * 60 seconds * 1000 milliseconds)
    public void runDaily() throws Exception {
        AppStartRunner appstarter = new AppStartRunner();
        appstarter.run();
    }
   
}