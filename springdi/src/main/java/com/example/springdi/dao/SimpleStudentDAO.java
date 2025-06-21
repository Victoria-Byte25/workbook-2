package com.example.springdi.dao;
import com.example.springdi.model.Student;
import org.springframework.stereotype.Component;

@Component
public class SimpleStudentDAO implements StudentDAO {
    @Override
    public void save (Student student) {
        System.out.println("Saving student: " + student);
    }
}
