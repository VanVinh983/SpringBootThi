package com.example.RestApiBook.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tacpham")
public class TacPham implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tenTP;
	private String loaiTP;
	private int soTrang;
	private double gia;
	private String tomTat;
	private String hinh;
	
	@ManyToOne
	@JoinColumn(name = "tacgia_id")
	private TacGia tacGia;

	public TacPham(String tenTP, String loaiTP, int soTrang, double gia, String tomTat, String hinh, TacGia tacGia) {
		super();
		this.tenTP = tenTP;
		this.loaiTP = loaiTP;
		this.soTrang = soTrang;
		this.gia = gia;
		this.tomTat = tomTat;
		this.hinh = hinh;
		this.tacGia = tacGia;
	}

	public TacPham() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenTP() {
		return tenTP;
	}

	public void setTenTP(String tenTP) {
		this.tenTP = tenTP;
	}

	public String getLoaiTP() {
		return loaiTP;
	}

	public void setLoaiTP(String loaiTP) {
		this.loaiTP = loaiTP;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public String getTomTat() {
		return tomTat;
	}

	public void setTomTat(String tomTat) {
		this.tomTat = tomTat;
	}

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}

	@Override
	public String toString() {
		return "TacPham [id=" + id + ", tenTP=" + tenTP + ", loaiTP=" + loaiTP + ", soTrang=" + soTrang + ", gia=" + gia
				+ ", tomTat=" + tomTat + ", hinh=" + hinh + ", tacGia=" + tacGia + "]";
	}
	
	
}
