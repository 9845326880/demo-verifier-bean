package com.example.verifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.verifier.config.AppConfig;

@SpringBootApplication
@Import({AppConfig.class})
@ComponentScan(basePackages = {"com.example"})
public class DemoVerifierBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoVerifierBeanApplication.class, args);
	}

}
