package com.rao.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class TutorialApplication {

	private static final Logger log = LoggerFactory.getLogger(TutorialApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
		log.info("Sever started");
	}

}
