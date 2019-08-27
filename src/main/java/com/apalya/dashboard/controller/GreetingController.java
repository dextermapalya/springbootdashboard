package com.apalya.dashboard.controller;

// import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/* import org.slf4j.Logger;
import org.slf4j.LoggerFactory; */
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static final Logger logger = LogManager.getLogger(GreetingController.class);
    // private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

    private List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Guest") String name, Model model) {
        model.addAttribute("name", name);
        logger.debug("Hello from Log4j 2 - num : {}", num);
        logger.debug("Debugging log in our greeting method");
        logger.info("Info log in our greeting method");
        logger.warn("Warning log in our greeting method");
        logger.error("Error in our greeting method");

        System.out.println("checking continuous buisssld....");
        //logger.debug("Hello from Log4j 2 - num : {}", () -> num);

        return "greeting";
    }

}