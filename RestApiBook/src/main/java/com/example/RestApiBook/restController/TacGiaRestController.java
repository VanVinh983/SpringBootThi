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

import com.example.RestApiBook.Service.TacGiaService;
import com.example.RestApiBook.entity.TacGia;


@RestController
@RequestMapping("tacgiaapi")
public class TacGiaRestController {
	@Autowired
	private TacGiaService tacGiaService;
	
	@GetMapping("tacgia")
	public List<TacGia> findAll(){
		return tacGiaService.findAll();
	}
	
	@GetMapping("tacgia/{id}")
	public TacGia findById(@PathVariable("id") int id) {
		return tacGiaService.findById(id);
	}
	@PostMapping("tacgia")
	public TacGia save(@RequestBody TacGia tacGia) {
		tacGiaService.save(tacGia);
		return tacGia;
	}
	@DeleteMapping("tacgia/{id}")
	public String delete(@PathVariable("id") int id) {
		TacGia tacPham = tacGiaService.findById(id);
		if (tacPham == null) {
			throw new RuntimeException("Employee id not found - " + id);
		}
		tacGiaService.delete(id);
		return "da xoa thanh cong id" + id;
	}
}
