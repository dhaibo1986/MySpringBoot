package com.dhb.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;

@Data
@ToString
@Component
@Validated
public class Person1 {
	@Value("${person.name}")
	@Email
	private String name;
	@Value("${person.age}")
	private Integer age;
	@Value("${person.sex}")
	private String sex;
	@Value("${person.likes}")
	private List<String> likes;
}
