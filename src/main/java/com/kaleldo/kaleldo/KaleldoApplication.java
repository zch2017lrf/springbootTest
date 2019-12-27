package com.kaleldo.kaleldo;

import com.kaleldo.kaleldo.annotation.EnableApplicationSelector;
import com.kaleldo.kaleldo.annotation.EnableTUserTRole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableApplicationSelector
@EnableTUserTRole
@SpringBootApplication
public class KaleldoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaleldoApplication.class, args);
    }

}
