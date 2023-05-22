package com.example.demo.Dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dao {

    Logger logger = LoggerFactory.getLogger(Dao.class);

    public String calling(Integer id) {
        logger.info("Calling method is stared");
        String name;

        if (id == 100) {
            name = "abdul";
        } else if (id == 200) {
            name = "rehaman s";
        } else {
            name = "invalid";
        }
        logger.info("Calling method is stared");
        return name;
    }
}
