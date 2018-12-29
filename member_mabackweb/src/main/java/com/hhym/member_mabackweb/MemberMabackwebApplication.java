package com.hhym.member_mabackweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hhym"})
public class MemberMabackwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberMabackwebApplication.class, args);
    }

}

