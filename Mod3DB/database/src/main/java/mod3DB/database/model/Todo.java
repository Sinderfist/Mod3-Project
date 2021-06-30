package mod3DB.database.model;

import javax.persistence.*;

@Entity
@Table(name="TodoList")

public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String tasks;
	
	@Column
	private Boolean completed;
	
	
	public Todo() {}
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTasks() {
		return tasks;
	}



	public void setTasks(String tasks) {
		this.tasks = tasks;
	}



	public Boolean getCompleted() {
		return completed;
	}



	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}


}






