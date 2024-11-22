package com.springdemo.lab4postgres.repository;
import com.springdemo.lab4postgres.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudRepo extends JpaRepository<Students, Integer>{

}
