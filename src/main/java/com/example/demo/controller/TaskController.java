package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.TaskModel;


@Controller
public class TaskController {
	
	//CORS対応
	@CrossOrigin
	@RequestMapping(value="/saveTask", method = RequestMethod.POST)
	private String saveNewTask(@RequestBody TaskModel task) {
		String contents = task.getContents();
		boolean complete = task.isComplete();
		System.out.println("新しいタスク：" + contents);
		System.out.println("完了：" + complete);
		return "";
	}

}
