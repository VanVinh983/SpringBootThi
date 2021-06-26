package com.example.ClientSpringBoot.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ClientSpringBoot.entity.TacGia;

@Service
public class TacGiaService {
	private final String URL = "http://localhost:6060/tacgiaapi/tacgia";
	private final String iURL = URL+"/{id}";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<TacGia> findAll(){
		ResponseEntity<TacGia[]> responseEntity = restTemplate.getForEntity(URL, TacGia[].class);
		TacGia[] tacGias = responseEntity.getBody();
		return Arrays.asList(tacGias);
	}
	
	public TacGia findById(int id) {
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", id);
		TacGia tacGia = restTemplate.getForObject(iURL, TacGia.class, params);
		return tacGia;
	} 
	
	public void delete(int id) {
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", id);
		restTemplate.delete(iURL,params);
	}
	public void post(TacGia tacGia) {
		restTemplate.postForObject(URL, tacGia, TacGia.class);
	}
			
}
