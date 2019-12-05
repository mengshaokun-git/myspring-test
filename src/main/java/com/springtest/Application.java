package com.springtest;

import meng.springframework.annotation.ComponentScan;
import meng.springframework.boot.SpringApplication;

@ComponentScan("com.springtest")
public class Application {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class);
    }

}
