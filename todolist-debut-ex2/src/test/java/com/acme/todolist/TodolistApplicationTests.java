package com.acme.todolist;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.acme.todolist.adapters.rest_api.TodoListController;
import com.acme.todolist.configuration.TodolistApplication;
import com.acme.todolist.domain.TodoItem;


@SpringBootTest(classes = TodolistApplication.class)

class TodolistApplicationTests {

	private static final String LATE = null;

	@Test
	void contextLoads() {
	}

}
