package com.acme.todolist.application.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.acme.todolist.application.port.in.AddTodoItem;
import com.acme.todolist.application.port.in.GetTodoItems;
import com.acme.todolist.application.port.out.LoadTodoItem;
import com.acme.todolist.application.port.out.UpdateTodoItem;
import com.acme.todolist.domain.TodoItem;

@Component
public class CreerItemService implements AddTodoItem {

	
	private UpdateTodoItem updateTodoItem;

	@Inject
	public CreerItemService(UpdateTodoItem  updateTodoItem) {
		this.updateTodoItem= updateTodoItem;

	}

	@Override
	public void addTodoItem(TodoItem item) {
		this.updateTodoItem.storeNewTodoItem(item);
		
	}
	


}

