package com.springbootloginandregisterapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootloginandregisterapp.model.Student;
import com.springbootloginandregisterapp.service.StudentserviceI;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	StudentserviceI ssi;
	@Autowired
	HttpSession session;

	@RequestMapping("/")
	public String prelogin() {

		return "login";
	}

	@RequestMapping("/openreg")
	public String preRegister() {

		return "register";
	}

	@RequestMapping("/register")
	public String RegisterData(@ModelAttribute Student s, Model m) {

		ssi.saveData(s);

		List<Student> list = new ArrayList<>();
		list.add(s);
		m.addAttribute("data", list);
	    m.addAttribute("msg", "Register Data Successfully!");
	    
		return "success";
	}

	@RequestMapping("/login")
	public String loginpage() {

		return "login";
	}

	@RequestMapping("/log")
	public String Loginpage(@RequestParam String username, @RequestParam String password, Model m) {

		List<Student> list = ssi.getData(username, password);
		if (!list.isEmpty()) {
			m.addAttribute("data", list);
		    m.addAttribute("msg", "Login Successfully!");

			return "success";
		} else {
			m.addAttribute("msg", "Username and Password are not match?");
			return "login";
		}
	}

	@RequestMapping("/deletedata")
	public String deleteData(@RequestParam int id,Model m) {
		// Delete the data
	    ssi.deleteData(id);
	    
	    // Retrieve updated data after deletion
	    List<Student> list = ssi.getData("admin", "admin");
	    
	    m.addAttribute("data", list);
	    m.addAttribute("msg", "Delete Data Successfully!");
		return "success";
	}
	@RequestMapping("/editdata")
	public String editData(@RequestParam int id,Model m) {
	
		Student s=ssi.editData(id);
		m.addAttribute("stu", s);
		return "edit";
	}
	
	 @RequestMapping("/update")
	    public String updateStudent(@ModelAttribute Student s, Model m) {
	        ssi.updateData(s);
	        
	        // Refresh the data after update
	        List<Student> list = ssi.getData("admin", "admin");
	        
	        m.addAttribute("data", list);
	        m.addAttribute("msg", "Data Updated Successfully.");
	        return "success";
	    }
}
