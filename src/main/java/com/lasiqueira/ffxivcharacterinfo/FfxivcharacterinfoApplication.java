package com.lasiqueira.ffxivcharacterinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class FfxivcharacterinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FfxivcharacterinfoApplication.class, args);
	}

}
