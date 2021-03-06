package com.dhb;

import com.dhb.servlet.MyServlet;
import com.dhb.servlet.listener.MyHttpSessionListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class MySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	//将servlet 添加到springboot容器中
	@Bean
	public ServletRegistrationBean<MyServlet> webServletRegistrationBean() {
		ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet(),"/s2");
		bean.setLoadOnStartup(1);
		return bean;
	}
	
	@Bean
	public ServletListenerRegistrationBean listenerRegistrationBean() {
		ServletListenerRegistrationBean srb = new ServletListenerRegistrationBean();
		srb.setListener(new MyHttpSessionListener());
		System.out.println("listener 创建成功");
		return srb;
	}
}
