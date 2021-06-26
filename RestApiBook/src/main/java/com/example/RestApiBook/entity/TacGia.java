package com.example.RestApiBook.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tacgia")
public class TacGia implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String hoTen;
	private String linhVuc;
	private String tieuSu;
	public TacGia(String hoTen, String linhVuc, String tieuSu) {
		super();
		this.hoTen = hoTen;
		this.linhVuc = linhVuc;
		this.tieuSu = tieuSu;
	}
	public TacGia() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLinhVuc() {
		return linhVuc;
	}
	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}
	public String getTieuSu() {
		return tieuSu;
	}
	public void setTieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}
	@Override
	public String toString() {
		return "TacGia [id=" + id + ", hoTen=" + hoTen + ", linhVuc=" + linhVuc + ", tieuSu=" + tieuSu + "]";
	}
	
	 

}
