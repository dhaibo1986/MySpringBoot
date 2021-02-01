package com.dhb.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {
	
	public String name = "张三";
	
	String name() default "zhangsan";
}

class Test{
	@MyAnnotation(name="hehe")
	private String name;
	
	@MyAnnotation
	public void hello() {
		
	}
}