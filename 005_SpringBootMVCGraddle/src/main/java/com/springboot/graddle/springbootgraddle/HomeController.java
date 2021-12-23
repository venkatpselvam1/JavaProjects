package com.springboot.graddle.springbootgraddle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/hello")
    public String SayHello(@RequestParam(name="username", defaultValue = "gradle venkat")String name)
    {
        logger.info("my custom log "+name);
        logger.error("my custom log "+name);
        return "Hello "+name+" !";
    }
}
