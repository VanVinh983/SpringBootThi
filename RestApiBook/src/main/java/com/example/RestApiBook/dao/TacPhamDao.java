package com.example.RestApiBook.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.RestApiBook.entity.TacPham;

public interface TacPhamDao extends JpaRepository<TacPham, Integer>{
	@Query(value = "select * from tacpham where tacgia_id = :id", nativeQuery = true)
	public List<TacPham> findByTacGiaId(@Param(value = "id") int id);
}
