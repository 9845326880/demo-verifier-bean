package com.example.verifier.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "verifierBean")
	public VerifierBean verifierBean() {
		return new VerifierBean();
	}
}
