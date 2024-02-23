package com.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.Student;
import com.entity.StudentEntity;

@org.springframework.stereotype.Controller
public class Controller 
{
//	@Autowired
//	Repository repo;
	
	@GetMapping("/")
	public String loadFrom(Model model)
	{
		loadFromData(model);
		
		return "index";
	}

	private void loadFromData(Model model) {
		List<String> courselist=new ArrayList<>();
		courselist.add("Java");
		courselist.add("Paython");
		courselist.add("JavaScript");
		courselist.add("Sql");
		
		List<String> timingList=new ArrayList<>();
		timingList.add("Morning");
		timingList.add("Evining");
		timingList.add("Night");
		
		model.addAttribute("Courses", courselist);
		model.addAttribute("Timings", timingList);
		
		
		Student s=new Student();
		model.addAttribute("student", s);
	}
	
	@PostMapping("/save")
	public String handelSubmit(Student ss,Model model)
	{
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(ss, entity);
		entity.setTimings(Arrays.toString(ss.getTimings()));
		
		//repo.save(entity);
		
		System.out.println(ss);
		loadFromData(model);
		
		model.addAttribute("msg", "Submitted SuccesFully !!!");
		return"index";
	}
	
	@PostMapping("/viewStudents")
	public String viewStudents(Model model)
	{
		
		//List<StudentEntity> list = repo.findAll();
		//model.addAttribute("Student", list);
		return "data";
	}

}
