package com.springdemo.lab4postgres.controller;

import com.springdemo.lab4postgres.entity.Students;
import com.springdemo.lab4postgres.repository.StudRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Slf4j
@RestController
public class MainController {
    @Autowired
    private StudRepo studRepo;
    @PostMapping("/api/students")
    public void addStudents(@RequestBody Students student){
        log.info("New Row " + studRepo.save(student));
    }
    @GetMapping("/api/students")
    public List<Students> getAllStudents(){
        return studRepo.findAll();
    }
    @GetMapping("/api/students/{id}")
    public Students getStudentById(@PathVariable int id){
        return studRepo.findById(id).orElseThrow();
    }
    @PutMapping("/api/students/{id}")
    public String updateStudent(@PathVariable int id ,@RequestBody Students student){
        if(!(studRepo.findById(id).isPresent())){
            return "no such student";
        }
        else{
            studRepo.save(student);
            return "student updated " + student.toString();
        }
    }
    @DeleteMapping("/api/students/{id}")
    public void deleteStudent(@PathVariable int id){
        studRepo.deleteById(id);
    }
}
