package com.springbootloginandregisterapp.service;

import java.util.List;

import com.springbootloginandregisterapp.model.Student;

public interface StudentserviceI {

	public void saveData(Student s);

	public List<Student> getData(String username, String password);

	public void deleteData(int id);

	public Student editData(int id);

	public void updateData(Student s);

	
	
	

}
