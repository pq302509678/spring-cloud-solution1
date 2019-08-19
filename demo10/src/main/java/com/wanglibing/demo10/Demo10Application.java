package com.wanglibing.demo10;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用lombok的注解注入log4j2
 */
@Log4j2
@SpringBootApplication
public class Demo10Application {

    public static void main(String[] args) {
        log.info("演示：使用log4j2");
        log.debug("Debugging log");
        log.info("Info log");
        log.warn("Hey, This is a warning!");
        log.error("Oops! We have an Error. OK");
        log.fatal("Damn! Fatal error. Please fix me.");
        SpringApplication.run(Demo10Application.class, args);
    }

}
