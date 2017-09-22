package com.jwt.starter.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class BootRunner implements CommandLineRunner {
    protected final Logger logger = LoggerFactory.getLogger(BootRunner.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info("spring-jwt-starter running!");
    }
}
