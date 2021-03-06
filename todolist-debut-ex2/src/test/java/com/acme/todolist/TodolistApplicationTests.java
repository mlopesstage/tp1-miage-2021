package com.acme.todolist;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.acme.todolist.configuration.TodolistApplication;
import com.acme.todolist.domain.TodoItem;


@SpringBootTest(classes = TodolistApplication.class)
class TodolistApplicationTests {

Boolean jspkoifer;
	@Test
	void contextLoads() {
		
	}
	
	@Test
	@ParameterizedTest
	void TestIsLate(TodoItem item) {
		
		jspkoifer = Instant.now().isAfter(item.getTime().plus(1, ChronoUnit.DAYS));
		assertTrue(jspkoifer, "LATE");	
					
	}

	/*private String finalContent(TodoItem item) {
		return (Instant.now().isAfter(item.getTime().plus(1, ChronoUnit.DAYS))) ? 
				LATE + item.getContent()
				: item.getContent();
	}*/
}
