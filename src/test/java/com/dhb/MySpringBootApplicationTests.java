package com.dhb;

import com.dhb.entity.Person;
import com.dhb.entity.Person1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringBootApplicationTests {

	@Autowired
	Person person;

	@Autowired
	Person1 person1;
	@Test
	void contextLoads() {
		System.out.println(person);
		System.out.println(person1);
	}

}
