package com.employeecrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Service;

import com.employeecrud.model.Employee;
import com.employeecrud.repository.EmployeeRepository;

@Service
public class ServiceImpl implements ServiceI {
		@Autowired
		EmployeeRepository er;
		
	@Override
	public void saveData(Employee e) {
		er.save(e);
	}

	@Override
	public List<Employee> getData(String username, String password) {
		
		if(username.equals("admin") && password.equals("admin")) {
			
		return	(List<Employee>) er.findAll();
		}
		else {
			
		return	er.findByUsernameAndPassword(username,password);
		}
		
	}

	@Override
	public void deleteData(int eid) {
		er.deleteById(eid);
	}

	@Override
	public Optional<Employee> EditData(int eid) {
		
		 Optional<Employee> list= er.findAllById(eid);
		 if(!list.isPresent()) {
			 return list;
		 }
		 else {
			return null;
		}
	}

	@Override
	public void UpdateData(Employee e) {
		er.save(e);
	}

}
