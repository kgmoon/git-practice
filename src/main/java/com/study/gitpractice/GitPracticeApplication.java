package com.study.gitpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GitPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitPracticeApplication.class, args);
    }
}
