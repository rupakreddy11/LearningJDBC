package com.rupak.LearningJDBC;

import com.rupak.LearningJDBC.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LearningJdbcApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setStudId(10);
		s.setStudName("Rupak");
		s.setMarks(87);


	}

}
