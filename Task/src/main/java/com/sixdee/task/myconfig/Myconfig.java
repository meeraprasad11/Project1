package com.sixdee.task.myconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sixdee.task.bean.RequestBean;
@Configuration
public class Myconfig 
{
	@Bean
	public RequestBean getData() {
		return new RequestBean();
	}
}
