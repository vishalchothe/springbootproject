package com.springbootloginandregisterapp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootloginandregisterapp.model.Student;
import com.springbootloginandregisterapp.repository.StudentRepository;


@Service
public class StduentserviceImpl implements StudentserviceI{
	
		@Autowired
		StudentRepository sr;
		
	@Override
	public void saveData(Student s) {
		sr.save(s);
	}

	 @Override
	    public List<Student> getData(String username, String password) {
	        if (username.equals("admin") && password.equals("admin")) {
	            return sr.findAll();
	        } else {
	            return sr.findByUsernameAndPassword(username, password);
	        }
	    }

	@Override
	public void deleteData(int id) {
		
		  sr.deleteById(id);;
	}

	@Override
	public Student editData(int id) {
		 Optional<Student> list = sr.findById(id);
	        if (list.isPresent()) {
	            return list.get(); // Return the student if found
	        } else {
	            return null; // Return null if the student with the given ID is not found
	        }
		
	}

	@Override
	public void updateData(Student s) {

	  sr.save(s);
	}
}
