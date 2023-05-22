package com.example.demo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {

    Logger log = LoggerFactory.getLogger(Service.class);

    public String getname() {
        log.info("Get name method is started here");
        String msg = "Welcome to Kodnest";
        log.info("Get name method is end here");
        return msg;

    }

    public String greet() {
        log.debug("Greet msg is started here");
        String name = "welcome to ashok it";
        log.debug("Greet msg is end here ");
        return "welcome to ashok it";
    }
}
