package com.springboot.springbootapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootapplication.dto.Student;
import com.springboot.springbootapplication.repo.StudentRepo;



@RestController
public class ApiController 
{
	@Autowired
	   StudentRepo sr;
		
	   //save the data
	
		@PostMapping("/save")
		public String SaveStudent(@RequestBody Student s)
		{
			sr.save(s);
			return "data save successifully";
		}
		
		//fetch data by using id
		@GetMapping("/getStudent")
		public Student getStudent(@RequestParam int id)
		{
			Optional<Student> s=sr.findById(id);
			if(s.isPresent())
			{
				return s.get();
			}
			else
			{
				return null;
			}
		}
		
		//to fetch all data
		@GetMapping("/getall")
		public List<Student> getAllStudents()
		{
			List<Student> s1=sr.findAll();
			return s1;
		}
		
		
		//to delete data
		
		 @DeleteMapping("/delete")
		public String DeleteStudent(@RequestParam int id)
		{
			Optional<Student> student=sr.findById(id);
			  
		      if(student.isPresent())
		      {
				  sr.deleteById(id);
				   return "data deleted successifully";
		      }
		      else
		      {
		    	return "data is not present";
		      }
		}
		
		
		//to update the data
		
		@PutMapping("/update")
		public Student UpdateStudent(@RequestParam int id,@RequestBody Student s)
		{
			Optional<Student> student=sr.findById(id);
			if(student.isPresent())
			{
				s.setId(id);
				return sr.save(s);
			}
			else
			{
				return null;
			}
		}
		
		
		@PatchMapping("/updatepassword")
		public Student UpdateStudent(@RequestParam int id,@RequestParam int password)
		{
			Optional<Student> student=sr.findById(id);
			if(student.isPresent())
			{
				Student s=student.get();
				s.setPassword(password);
				return sr.save(s);
			}
			else
			{
				return null;
			}
		}
		
		//to delete all data
		
		@DeleteMapping("/deleteall")
		public String DeleteAll()
		{
			sr.deleteAll();
			return "data deleted successifully";
		}
		
}
