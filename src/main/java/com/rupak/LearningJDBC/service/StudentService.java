package com.rupak.LearningJDBC.service;

import com.rupak.LearningJDBC.dao.StudentRepo;
import com.rupak.LearningJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s){
        repo.save(s);
        System.out.println("Added Student successfully");
    }


    public List<Student> getStudents() {

        return repo.findAll();
    }
}
