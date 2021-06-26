package com.problem16.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.problem16.entity.Lecturer;
import com.problem16.service.LecturerService;

@Controller
@RequestMapping("/lecturer")
public class LecturerController {
	
	@Autowired
	private LecturerService lecturerService;
	
	@GetMapping("/list")
	public ModelAndView getListLecturer() {
		List<Lecturer> lecturers = lecturerService.findAll();
		
		return new ModelAndView("list-lecturer", "lecturers", lecturers);
	}
	
	@GetMapping("/detail/{id}")
	public ModelAndView getLecturer(@PathVariable("id") int id) {
		Lecturer lecturer = lecturerService.getLecturer(id);
		
		return new ModelAndView("detail-lecturer", "lecturer", lecturer);
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteLecturer(@PathVariable("id") int id) {
		lecturerService.deleteLecturer(id);
		return new ModelAndView("redirect:/lecturer/list");
	}
	
	@GetMapping("/update/{id}")
	public ModelAndView showUpdateLecturerForm(@PathVariable("id") int id) {
		Lecturer lecturer = lecturerService.getLecturer(id);
		
		return new ModelAndView("update-lecturer-form", "lecturer", lecturer);
	}
	
	@PostMapping("/update/{id}")
	public ModelAndView processUpdateLecturer(@ModelAttribute("lecturer") Lecturer lecturer) {
		lecturerService.updateLecturer(lecturer);
		
		return new ModelAndView("redirect:/lecturer/list");
	}
	
	@GetMapping("/create")
	public ModelAndView showAddLecturerForm() {
		return new ModelAndView("add-lecturer-form", "lecturer", new Lecturer());
	}
	
	@PostMapping("/create")
	public ModelAndView processAddLecturerForm(@ModelAttribute("lecturer") Lecturer lecturer) {
		lecturerService.saveLecturer(lecturer);
		return new ModelAndView("redirect:/lecturer/list");
	}
}
