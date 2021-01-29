package com.dhb.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@ToString
@ConfigurationProperties(prefix = "person")
@Component
public class Person {

	private String name;
	private Integer age;
	private String sex;
	private List<String> likes;
}
