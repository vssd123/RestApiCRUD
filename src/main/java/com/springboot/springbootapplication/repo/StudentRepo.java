package com.springboot.springbootapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootapplication.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
