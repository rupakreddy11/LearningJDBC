package com.rupak.LearningJDBC.dao;

import com.rupak.LearningJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }



    public void save(Student s)
    {
        String sql = "insert into student (studId, studName, marks) values (?,?,?)";

        int r = jdbc.update(sql, s.getStudId(), s.getStudName(), s.getMarks());
        System.out.println(r + "effected");
    }

    public List<Student> findAll() {

        String sql = "select * from student";

        RowMapper<Student> mapper = (rs, rowNum) -> {
                Student s = new Student();
                s.setStudId(rs.getInt("studId"));
                s.setStudName(rs.getString("studName"));
                s.setMarks(rs.getInt("marks"));


                return s;
            };


        return jdbc.query(sql, mapper);

    }


}
