package com.example.ClientSpringBoot.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TacGia{
	
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
