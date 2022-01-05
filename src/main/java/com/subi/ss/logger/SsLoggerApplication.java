package com.subi.ss.logger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Slf4j
@SpringBootApplication
public class SsLoggerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SsLoggerApplication.class, args);
		log.info("Logger application starts... ");
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SsLoggerApplication.class);
	}
}
