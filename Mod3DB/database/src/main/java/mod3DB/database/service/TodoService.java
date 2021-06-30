package mod3DB.database.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import mod3DB.database.model.Todo;
import mod3DB.database.repository.TodoRepository;



@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepo;
//	
//	public List<Todo>fetchAllTodos () {
//		return todoRepo.fetchAllTodos();
//		
//	}
	
	public Iterable<Todo> getTodo(){
		return this.todoRepo.findAll();			
	}
	
	public Todo getTodobyId(Long id) {
		return todoRepo.findById(id).get();
	}
	
	public Todo createTodos(Todo data) {
		return todoRepo.save(data);
	}
	
	public Todo updateTodos(Todo data) {
		return todoRepo.save(data);
	}
	
	public HttpStatus deleteTodos(Long id) {
		todoRepo.deleteById(id);
		return HttpStatus.OK;
	}
}
