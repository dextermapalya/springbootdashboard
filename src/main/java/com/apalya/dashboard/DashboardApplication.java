package com.apalya.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardApplication {

	public static void main(String[] args) {
		/*LOGGER.debug("Debug Message Logged !!!");
		LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));	*/	
		SpringApplication.run(DashboardApplication.class, args);
	}

}
