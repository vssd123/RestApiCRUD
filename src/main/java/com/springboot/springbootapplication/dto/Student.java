package com.springboot.springbootapplication.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Student 
{
	@Id
    private int id;
    private String name;
    private String age;
    @Column(unique =true)
    private String email;
    private int password;
    
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAge() 
	{
		return age;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public int getPassword() 
	{
		return password;
	}
	public void setPassword(int password)
	{
		this.password = password;
	}
    
    
}
