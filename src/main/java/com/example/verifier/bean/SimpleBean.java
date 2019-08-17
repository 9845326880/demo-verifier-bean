package com.example.verifier.bean;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SimpleBean {
	public String getBeanName() {
		return this.getClass().getName();
	}
	
	@PostConstruct
	public void init() {
		log.info("SimpleBean.init invoked");
	}
}
