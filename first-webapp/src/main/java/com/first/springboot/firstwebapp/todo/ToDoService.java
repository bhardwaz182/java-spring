package com.first.springboot.firstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
	private static List<ToDo> todos = new ArrayList<>();
	
	static {
		todos.add(new ToDo(1,"webapp","course 1",LocalDate.now(),false));
		todos.add(new ToDo(2,"webapp","course 2",LocalDate.now().plusYears(1),false));
	}
	
	public List<ToDo> findByUsername(String username){
		return todos;
	}
	
}
