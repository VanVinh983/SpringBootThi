package com.example.RestApiBook.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApiBook.Service.TacPhamService;
import com.example.RestApiBook.entity.TacPham;

@RestController
@RequestMapping(value = "tacphamapi")
public class TacPhamRestController {
	@Autowired
	private TacPhamService tacPhamService;
	
	@GetMapping("tacpham")
	public List<TacPham> findAll(){
		return tacPhamService.findAll();
	}
	
	@GetMapping("tacpham/{id}")
	public TacPham findById(@PathVariable("id") int id) {
		return tacPhamService.findById(id);
	}
	@PostMapping("tacpham")
	public TacPham save(@RequestBody TacPham tacPham) {
		tacPhamService.save(tacPham);
		return tacPham;
	}
	@DeleteMapping("tacpham/{id}")
	public String delete(@PathVariable("id") int id) {
		TacPham tacPham = tacPhamService.findById(id);
		if (tacPham == null) {
			throw new RuntimeException("Employee id not found - " + id);
		}
		tacPhamService.delete(id);
		return "da xoa thanh cong id" + id;
	}
}
