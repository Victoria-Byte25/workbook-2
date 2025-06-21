package com.example.springdi.service;
import com.example.springdi.dao.StudentDAO;
import com.example.springdi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationService {
    private final StudentDAO studentDAO;

    @Autowired
    public RegistrationService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
    public void register(Student student) {
        studentDAO.save(student);
    }

}
