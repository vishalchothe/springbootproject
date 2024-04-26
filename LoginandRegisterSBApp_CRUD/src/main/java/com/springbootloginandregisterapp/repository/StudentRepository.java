package com.springbootloginandregisterapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootloginandregisterapp.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	List<Student> findAll();

	List<Student> findByUsernameAndPassword(String username, String password);

}
