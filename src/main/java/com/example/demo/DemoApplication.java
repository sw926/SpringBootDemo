package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public DemoApplication(DemoBean demoBean) {
        String ans = demoBean.randUUID(System.currentTimeMillis());
        System.out.println("----- ans: " + ans + "---------");
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
