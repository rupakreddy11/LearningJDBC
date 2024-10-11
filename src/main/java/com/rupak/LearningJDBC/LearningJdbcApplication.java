package com.rupak.LearningJDBC;

import com.rupak.LearningJDBC.model.Student;
import com.rupak.LearningJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class LearningJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LearningJdbcApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setStudId(03);
		s.setStudName("Rupak");
		s.setMarks(87);



		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);


	}

}
