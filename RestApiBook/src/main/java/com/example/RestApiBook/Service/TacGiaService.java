package com.example.RestApiBook.Service;

import java.util.List;

import com.example.RestApiBook.entity.TacGia;


public interface TacGiaService {
	public List<TacGia> findAll();
	public TacGia findById(int id);
	public void save(TacGia tacGia);
	public void delete(int id);
}
