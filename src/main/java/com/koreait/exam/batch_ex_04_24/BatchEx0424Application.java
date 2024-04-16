package com.koreait.exam.batch_ex_04_24;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class BatchEx0424Application {

    public static void main(String[] args) {
        SpringApplication.run(BatchEx0424Application.class, args);
    }

}
