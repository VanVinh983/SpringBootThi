package com.example.RestApiBook.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApiBook.Service.TacPhamService;
import com.example.RestApiBook.dao.TacPhamDao;
import com.example.RestApiBook.entity.TacPham;

@Service
public class TacPhamServceImpl implements TacPhamService{
	
	private TacPhamDao tacPhamDao;
	
	
	@Autowired
	public TacPhamServceImpl(TacPhamDao tacPhamDao) {
		super();
		this.tacPhamDao = tacPhamDao;
	}

	@Override
	public List<TacPham> findAll() {
		// TODO Auto-generated method stub
		return tacPhamDao.findAll();
	}

	@Override
	public TacPham findById(int id) {
		// TODO Auto-generated method stub
		Optional<TacPham> result = tacPhamDao.findById(id);
		TacPham tacPham = null;
		if (result.isPresent()) {
			tacPham = result.get();
		}else {
			throw new RuntimeException("khong tim thay "+id);
		}
		return tacPham;
	}

	@Override
	public List<TacPham> findByTacGiaId(int id_tacgia) {
		// TODO Auto-generated method stub
		return tacPhamDao.findByTacGiaId(id_tacgia);
	}

	@Override
	public void save(TacPham tacPham) {
		// TODO Auto-generated method stub
		tacPhamDao.save(tacPham);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tacPhamDao.deleteById(id);
	}
	
}
