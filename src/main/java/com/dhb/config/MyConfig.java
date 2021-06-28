package com.dhb.config;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Configuration
public class MyConfig implements WebMvcConfigurer {
	
	
	@Bean
	public LocaleResolver localeResolver() {
		return new NativeLocaleResolver();
	}
	
	protected static class NativeLocaleResolver implements LocaleResolver {
		
		@Override
		public Locale resolveLocale(HttpServletRequest request) {
			String language = request.getParameter("language");
			Locale locale = Locale.getDefault();
			if(!ObjectUtils.isEmpty(language)){
				String[] split = language.split("_");
				locale = new Locale(split[0],split[1]);
			}
			return locale;
		}

		@Override
		public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
			
		}
	}
}
