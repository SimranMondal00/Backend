package com.simsam.SpringJDBCEx.repo;

import com.simsam.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        String sql = "insert into student (rollNo,name,marks) values (?,?,?)";
        jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
    }

    public List<Student> findAll() {
       String sql = "select * from student";

       // Type 1 (Using RowMapper)

//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//                Student s = new Student();
//                s.setRollNo(rs.getInt("rollNo"));
//                s.setName(rs.getString("name"));
//                s.setMarks(rs.getInt("marks"));
//                return s;
//            }
//        };
//          return jdbc.query(sql,mapper);


        // Type 2 ( Using Lambda Expression)

       return jdbc.query(sql,( rs,  rowNum) -> {

           Student s = new Student();
           s.setRollNo(rs.getInt("rollNo"));
           s.setName(rs.getString("name"));
           s.setMarks(rs.getInt("marks"));
           return s;
       });
    }
}
