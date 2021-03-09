package com.acme.todolist;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.acme.todolist.configuration.TodolistApplication;
import com.acme.todolist.domain.TodoItem;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


@SpringBootTest(classes = TodolistApplication.class)
class TodolistApplicationTests {

	@Test
	void itemIsLate24Hours() { //Test si la date est en retard de 24h
		TodoItem item = new TodoItem("1", Instant.now().minus(23,ChronoUnit.HOURS), "mycontent");
		assertThat(item.finalContent(),item.isLate(),is(false));
	}
	
	@Test
	void itemContentIsNotEmpty() { //Test que le champ content soit bien rempli
		TodoItem item = new TodoItem("1", Instant.now().minus(23,ChronoUnit.HOURS), "mycontent");
		assertThat("[Content is empty!]",item.getContent().isEmpty(),is(false));
	}
	
	@Test
	void itemIdIsEgreaters0Empty() { //Test si la taille de l'ID est bien supérieure ou égale à 8
		TodoItem item = new TodoItem("12345678", Instant.now().minus(23,ChronoUnit.HOURS), "mycontent");
		assertThat("[ID is too short!]",item.getId().length() < 8,is(false));
	}
}
