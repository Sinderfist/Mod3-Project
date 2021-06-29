package mod3DB.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mod3DB.database.model.Todo;
import mod3DB.database.service.TodoService;


@CrossOrigin
@RestController
@RequestMapping("/facespace")
public class TodoController {
 
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/TodoList")
	public ResponseEntity<?> fetchAllTodoItems(){
		List<Todo> todoItems = todoService.fetchAllTodoItems();
		return ResponseEntity.status(HttpStatus.OK).body(todoItems);
	}

}
