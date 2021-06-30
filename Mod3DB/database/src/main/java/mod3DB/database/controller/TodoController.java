package mod3DB.database.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import mod3DB.database.model.Profile;
import mod3DB.database.model.Todo;
import mod3DB.database.service.TodoService;


@CrossOrigin
@RestController
@RequestMapping("/todolist")
public class TodoController {
 
	@Autowired
	private TodoService todoService;
	
	
	@GetMapping
	public Iterable<Todo> getTodo(){
		return todoService.getTodo();
	}
	
	@GetMapping("/{id}")
	public Todo getTodoById(Long id) {
		return todoService.getTodobyId(id);
	}
	
//	@GetMapping
//	public ResponseEntity<?> fetchAllTodoItems(){
//		List<Todo> todoItems = todoService.fetchAllTodos();
//		return ResponseEntity.status(HttpStatus.OK).body(todoItems);
//	}
	
	@PostMapping
	public Todo createTodo(@RequestBody Todo data){
		return todoService.createTodos(data);
	}

	@PutMapping
	public Todo updateTodo(@RequestBody Todo data) {
		return todoService.updateTodos(data);
		
	}
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteTodo(@PathVariable Long id) {
		return todoService.deleteTodos(id);
	}

}
