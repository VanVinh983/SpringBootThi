package com.example.ClientSpringBoot.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ClientSpringBoot.entity.TacPham;

@Service
public class TacPhamService {

	private final String url = "http://localhost:6060/tacphamapi/tacpham";
	private final String iurl = url+"/{id}";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<TacPham> findAll(){
		ResponseEntity<TacPham[]> responseEntity = restTemplate.getForEntity(url, TacPham[].class);
		TacPham[] tacPhams = responseEntity.getBody();
		return Arrays.asList(tacPhams);
 	}
	public TacPham findById(int id) {
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", id);
		TacPham tacPham = restTemplate.getForObject(iurl, TacPham.class, params);
		return tacPham;
	}
	public void delete(int id) {
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", id);
		restTemplate.delete(iurl, params);
	}
	public void post( TacPham tacPham) {
		restTemplate.postForObject(url, tacPham, TacPham.class);
	}
}
