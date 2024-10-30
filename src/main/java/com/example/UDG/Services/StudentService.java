package com.example.UDG.Services;

import com.example.UDG.Models.StudentModel;
import com.example.UDG.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public ArrayList<StudentModel> findAllStudents() {
        return(ArrayList<StudentModel>) studentRepository.findAll();
    }

    public StudentModel saveStudent(StudentModel student)  {
        return studentRepository.save(student);
    }

    public ArrayList<StudentModel> findByName(String name) {
        return studentRepository.findByName(name);
    }

    public Optional<StudentModel> findByCode(String code) {
        return studentRepository.findByCode(code);
    }

    public String  deleteStudentByCode(String code) {

        Optional<StudentModel> student = studentRepository.findByCode(code);
        if (student.isPresent()) {
            studentRepository.delete(student.get());
            return "Se elimino el estudiante existosamente";
        }
        else
        {
            return "El estudiante no existe";
        }
    }

    public StudentModel updateStudent(String code,StudentModel student) {
        return findByCode(code).isPresent()? studentRepository.save(student) : new StudentModel("Student not found","","",00d,"");
    }
}
