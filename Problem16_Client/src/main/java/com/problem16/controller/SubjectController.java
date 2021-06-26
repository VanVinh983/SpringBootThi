package com.problem16.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.problem16.entity.Lecturer;
import com.problem16.entity.Subject;
import com.problem16.service.LecturerService;
import com.problem16.service.SubjectService;

@Controller
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@Autowired
	private LecturerService lecturerService;
	
	@GetMapping("/create/{lecturerID}")
	public ModelAndView showAddSubjectForm() {
		return new ModelAndView("add-subject-form", "subject", new Subject());
	}
	
	@PostMapping("/create/{lecturerID}")
	public ModelAndView addSubject(@PathVariable("lecturerID") int id, @ModelAttribute("subject") Subject subject) {
		Lecturer lecturer = lecturerService.getLecturer(id);
		lecturer.getSubjects().add(subject);
		
		lecturerService.updateLecturer(lecturer);
		
		return new ModelAndView("redirect:/lecturer/list");
	}
}
