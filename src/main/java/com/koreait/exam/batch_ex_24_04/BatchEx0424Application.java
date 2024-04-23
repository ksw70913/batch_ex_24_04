package com.koreait.exam.batch_ex_24_04;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableBatchProcessing
@EnableJpaAuditing
public class BatchEx0424Application {

    public static void main(String[] args) {
        SpringApplication.run(BatchEx0424Application.class, args);
    }

}
