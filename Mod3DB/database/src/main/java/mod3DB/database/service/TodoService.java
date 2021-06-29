package mod3DB.database.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mod3DB.database.model.Todo;
import mod3DB.database.repository.TodoRepository;



@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepo;
	
	public List<Todo>fetchAllTodoItems () {
		return todoRepo.fetchAllTodos();
		
	}
}
