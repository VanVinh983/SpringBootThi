package com.problem16.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.problem16.entity.Lecturer;

@Service
public class LecturerService {

	private static final String URL = "http://localhost:8080/api/lecturers";
	private static final String idURL = URL + "/{id}";

	@Autowired
	private RestTemplate restTemplate;

	public List<Lecturer> findAll() {

		ResponseEntity<Lecturer[]> responseEntity = restTemplate.getForEntity(URL, Lecturer[].class);
		Lecturer[] lecturerArray = responseEntity.getBody();

		return Arrays.asList(lecturerArray);
	}

	public Lecturer getLecturer(int id) {
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", id);

		Lecturer lecturer = restTemplate.getForObject(idURL, Lecturer.class, params);

		return lecturer;
	}

	public void deleteLecturer(int id) {
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", id);

		restTemplate.delete(idURL, params);
	}

	public void updateLecturer(Lecturer lecturer) {
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", lecturer.getId());

		restTemplate.put(idURL, lecturer, params);
	}

	public void saveLecturer(Lecturer lecturer) {
		restTemplate.postForObject(URL, lecturer, Lecturer.class);
	}
}
