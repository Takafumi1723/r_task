package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {
	
	@RequestMapping(value="/saveTask")
	private String saveNewTask() {
		System.out.println("API呼ばれました！!!!");
		return "";
	}

}
