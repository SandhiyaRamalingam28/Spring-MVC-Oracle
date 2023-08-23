package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Controller
public class StudentController {
	@Autowired
	StudentDao studentDao;
	
	 @RequestMapping("/studentForm")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Student());  
	        return "studentForm";   
	    }    
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(@ModelAttribute ("stud")Student stud){
        	studentDao.save(stud);
            return "redirect:/studentForm";
    }

}
