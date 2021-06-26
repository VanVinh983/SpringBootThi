package com.problem16.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.problem16.entity.Lecturer;
import com.problem16.entity.Subject;

@Service
public class SubjectService {
	
	private static final String sURL = "http://localhost:8080/api/subjects";
	private static final String lURL = "http://localhost:8080/api/lecturers";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LecturerService lecturerService;
	
}
