package com.example.ClientSpringBoot.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TacPham  {
	
	private int id;
	@Size(min = 1, message = "khong duoc rong")
	@Pattern(regexp = "^[A-Z][\\w]*$|^[A-Z][\\w]*(\\s[A-Z][\\w]*)*", message = "sai dinh dang")
	private String tenTP;
	@Size(min = 1, message = "khong duoc rong")
	private String loaiTP;
	@Min(value = 1, message = "Phai lon hon 0")
	private int soTrang;
	@Min(value = 1, message = "Phai lon hon 0")
	private double gia;
	@Size(min = 1, message = "khong duoc rong")
	private String tomTat;
	private String hinh;
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
