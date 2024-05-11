package com.first.springboot.firstwebapp.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {


	private ToDoService todos;
	
	
	
	public ToDoController(ToDoService todos) {
		super();
		this.todos = todos;
	}



	@RequestMapping("/todo")
	public List<ToDo> showTodo(ModelMap model) {
		model.put("todos", todos.findByUsername("temp"));
		return todos.findByUsername("temp");
	}
}
