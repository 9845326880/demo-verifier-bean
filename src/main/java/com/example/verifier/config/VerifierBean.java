package com.example.verifier.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContextException;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VerifierBean implements BeanFactoryPostProcessor, PriorityOrdered {

	PropertyPlaceholderConfigurer ppc;
	
	@Override
	public int getOrder() {
		return Ordered.HIGHEST_PRECEDENCE;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Environment env = beanFactory.getBean(Environment.class);
		String propValue = env.getProperty("logging.level.org");
		System.out.println("logging.level.org = "+propValue);
		log.info("logging.level.org = "+propValue);
		
		if (propValue == null) {
			throw new ApplicationContextException("Property numst be defined for logging.level.org");
		}
	}

}
