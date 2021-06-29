package mod3DB.database.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mod3DB.database.model.Todo;



@Repository
public class TodoRepository{

	private int counter = 0;
	private List<Todo> todoItems = new ArrayList<>();
	
	public List<Todo> fetchAllTodos (){
		if(todoItems.size() == 0 ) {
			Todo item1 = new Todo();
			item1.setId(counter++);
			item1.setCompleted(false);
			item1.setTasks("add a new task");
			
			todoItems.add(item1);
			
		}
		return todoItems;
	}
	
}
