package com.example.UDG.Controllers;

import com.example.UDG.Models.StudentModel;
import com.example.UDG.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    StudentService studentService;
    
    @GetMapping()
    public ArrayList<StudentModel> findAllStudents() {
        return studentService.findAllStudents();
    }

    @PostMapping()
    public StudentModel saveStudent(@RequestBody StudentModel student) {
        return studentService.saveStudent(student);
    }

    @PutMapping()
    public StudentModel updateStudent(@RequestBody StudentModel student) {
        return studentService.saveStudent(student);
    }

    @PutMapping(path ="/update-by-code")
    public StudentModel updateStudent(@RequestParam("code") String code,@RequestBody StudentModel student) {
        return studentService.updateStudent(code,student);
    }

    @GetMapping(path = "/find-by-code")
    public Optional<StudentModel> finByCode(@RequestParam("code") String code) {
        return studentService.findByCode(code);
    }

    @GetMapping(path = "/find-by-name")
    public ArrayList<StudentModel> finByName(@RequestParam("name") String name) {
        return studentService.findByName(name);
    }

    @DeleteMapping(path = "/delete-by-code")
    public String deleteStudentByCode(@RequestParam("code") String code) {
        return studentService.deleteStudentByCode(code);
    }

}
