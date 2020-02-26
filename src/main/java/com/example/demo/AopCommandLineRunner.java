package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AopCommandLineRunner implements CommandLineRunner {

    @Autowired
    private Test test;

    @Override
    public void run(String... args) throws Exception {
        test.test();
    }
}
