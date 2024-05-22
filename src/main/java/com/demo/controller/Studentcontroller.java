package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.repository.Studentinterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Studentcontroller {

	@Autowired
	private Studentinterface stud;

	@PostMapping("/insert")
	@CrossOrigin(origins = "http://localhost:4200")
	public Student insertstudent(@RequestBody Student s) {
		
		return stud.save(s);
	}
	@PostMapping("/update")
	@CrossOrigin(origins = "http://localhost:4200")
	public Student updatestudent(@RequestBody Student s) {
		
		return stud.save(s);
	}
	@PostMapping("/delete")
	@CrossOrigin(origins = "http://localhost:4200")
	public Student deletestudent(@RequestBody Student s) {
		
		stud.delete(s);
		return s;
	}
	@GetMapping("/view")
    @CrossOrigin(origins="http://localhost:4200")
    public List<Student> viewstudent()
    {
        return this.stud.findAll();    
    }
}
