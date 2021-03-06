package com.acme.todolist;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.acme.todolist.domain.TodoItem;

@SpringBootTest
class TodolistApplicationTests {

	private String LATE = "[LATE!]";
	@Test
	void TestIsLate(TodoItem item) {
		//if(Instant.now().isAfter(item.getTime().plus(1, ChronoUnit.DAYS)))
			
		
	}

	private String finalContent(TodoItem item) {
		return (Instant.now().isAfter(item.getTime().plus(1, ChronoUnit.DAYS))) ? 
				LATE + item.getContent()
				: item.getContent();
	}
}
