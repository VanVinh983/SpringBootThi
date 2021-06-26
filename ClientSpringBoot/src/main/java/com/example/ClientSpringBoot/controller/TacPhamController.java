package com.example.ClientSpringBoot.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.ClientSpringBoot.entity.TacGia;
import com.example.ClientSpringBoot.entity.TacPham;
import com.example.ClientSpringBoot.service.TacGiaService;
import com.example.ClientSpringBoot.service.TacPhamService;

@Controller
@RequestMapping(value = "/tp")
public class TacPhamController {
	@Autowired
	private TacPhamService tacPhamService;
	
	@Autowired
	private TacGiaService tacGiaService;
	
	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("tacphams", tacPhamService.findAll());
		model.addAttribute("tacgias", tacGiaService.findAll());
		return "list";
	}
	@GetMapping("manager")
	public String manger(Model model) {
		model.addAttribute("tacphams", tacPhamService.findAll());
		return "manager";
	}
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") int id) {
		tacPhamService.delete(id);
		return "redirect:/tp/manager";
	}
	@GetMapping("showform")
	public String showform(Model model) {
		model.addAttribute("tacpham", new TacPham());
		List<TacGia> tacGias = tacGiaService.findAll();
		model.addAttribute("tacgias", tacGias);
		return "form";
	}
	@PostMapping("save")
	public String save(@Valid @ModelAttribute("tacpham") TacPham tacPham,BindingResult result, @RequestParam("hinhanh") MultipartFile hinhanh, Model model) throws IOException {
		
		if (result.hasErrors()) {
			List<TacGia> tacGias = tacGiaService.findAll();
			model.addAttribute("tacgias", tacGias);
			return "form";
		}else {
			File file = new File("src/main/resources/static/image/"+hinhanh.getOriginalFilename());
			file.createNewFile();
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(hinhanh.getBytes());
			fileOutputStream.close();
			tacPham.setHinh(hinhanh.getOriginalFilename());
			TacGia tacGia = tacGiaService.findById(tacPham.getTacGia().getId());
			tacPham.setTacGia(tacGia);
			tacPhamService.post(tacPham);
			return "redirect:/tp/list";
		}
	}
}
