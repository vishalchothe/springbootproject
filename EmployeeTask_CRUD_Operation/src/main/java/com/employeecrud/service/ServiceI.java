package com.employeecrud.service;

import java.util.List;
import java.util.Optional;

import com.employeecrud.model.Employee;

public interface ServiceI {

	void saveData(Employee e);

	List<Employee> getData(String username, String password);

	void deleteData(int eid);

	Optional<Employee> EditData(int eid);

	void UpdateData(Employee e);

}
