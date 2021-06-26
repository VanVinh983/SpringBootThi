package com.example.RestApiBook.Service;

import java.util.List;

import com.example.RestApiBook.entity.TacPham;

public interface TacPhamService {
	public List<TacPham> findAll();
	public TacPham findById(int id);
	public List<TacPham> findByTacGiaId(int id_tacgia);
	public void save(TacPham tacPham);
	public void delete(int id);
}
