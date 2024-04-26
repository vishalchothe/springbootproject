package com.employeecrud.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employeecrud.model.Employee;
import com.employeecrud.service.ServiceI;

@Controller
public class HomeController {

	@Autowired
	ServiceI si;

	@RequestMapping("/")
	public String prelogin() {

		return "login";
	}

	@RequestMapping("/openregister")
	public String preregister() {

		return "register";
	}

	@RequestMapping("/save")
	public String registractionSave(@ModelAttribute Employee e, Model m) {
         System.out.println(e.getId());
		si.saveData(e);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		m.addAttribute("data", list);

		m.addAttribute("msg", "Eeuuu Registraction Successfully!");

		return "success";
	}

	@RequestMapping("/login")
	public String loginPage() {

		return "login";
	}

	@RequestMapping("/log")
	public String afterloginPage(@RequestParam String username, @RequestParam String password, Model m) {
		List<Employee> list=si.getData(username,password);
		
		if (!list.isEmpty()) {
			
			m.addAttribute("data", list);
			m.addAttribute("msg", "Eeuuu All Data View!");

			return "success";
		} else {
			return "login";
		}
	}
	
	@RequestMapping("/delete")
	public String DeleteData(@RequestParam int eid, Model m) {
		
		si.deleteData(eid);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String EditData(@RequestParam int id, Model m) {
		
		Optional<Employee> e=si.EditData(id);
		m.addAttribute("data", e);
		return "success";
	}
	
	@RequestMapping("/update")
	public String UpdateData(@ModelAttribute Employee e, Model m) {
		
		si.UpdateData(e);
		
		List<Employee> list = si.getData("admin", "admin");
		m.addAttribute("data", list);
		m.addAttribute("msg", "data Updated Suucessfully");
		
		return "success";
	}
	
}
