package com.example.RestApiBook.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApiBook.Service.TacGiaService;
import com.example.RestApiBook.dao.TacGiaDao;
import com.example.RestApiBook.entity.TacGia;

@Service
public class TacGiaServiceImpl implements TacGiaService{
	private TacGiaDao tacGiaDao;
	
	
	@Autowired
	public TacGiaServiceImpl(TacGiaDao tacGiaDao) {
		super();
		this.tacGiaDao = tacGiaDao;
	}

	@Override
	public List<TacGia> findAll() {
		// TODO Auto-generated method stub
		return tacGiaDao.findAll();
	}

	@Override
	public TacGia findById(int id) {
		Optional<TacGia> result = tacGiaDao.findById(id);
		TacGia tacGia = null;
		if (result.isPresent()) {
			tacGia = result.get();
		}else {
			throw new RuntimeException("khong tim thay "+id);
		}
		return tacGia;
	}

	@Override
	public void save(TacGia tacGia) {
		// TODO Auto-generated method stub
		tacGiaDao.save(tacGia);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tacGiaDao.deleteById(id);
		
	}

}
