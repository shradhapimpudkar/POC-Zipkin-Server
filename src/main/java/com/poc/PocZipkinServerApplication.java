package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SuppressWarnings("deprecation")
@SpringBootApplication
public class PocZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocZipkinServerApplication.class, args);
	}

}
