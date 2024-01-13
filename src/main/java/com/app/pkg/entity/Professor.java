package com.app.pkg.entity;




import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="professor")

public class Professor {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(mappedBy = "professor")
    private List<Quiz> quizzes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
