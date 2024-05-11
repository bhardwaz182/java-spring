package com.first.springboot.firstwebapp.todo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;


public class ToDo {
//	id,username,description,targetDate,done
	private long id;
	private String username;
	private String description;
	private LocalDate targetDate;
	private boolean done;
	
	public ToDo(int id, String username, String description, LocalDate targetDate, Boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}
	
}
