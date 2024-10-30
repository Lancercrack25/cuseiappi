package com.example.UDG.Repositories;

import com.example.UDG.Models.StudentModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<StudentModel,Long> {

    public abstract ArrayList<StudentModel> findByName(String name);

    public Optional<StudentModel> findByCode(String code);





}
