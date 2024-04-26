package com.employeecrud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employeecrud.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	List<Employee> findByUsernameAndPassword(String username, String password);

	Optional<Employee> findAllById(int eid);

	

}
