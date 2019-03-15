package edu.fithou.java.dto;

import java.io.Serializable;

public class KhachHang implements Serializable{

	private Long id;
	
	private String ten;
	
	private String sdt;
	
	private String diaChi;
	
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	
	public KhachHang(Long id, String ten, String sdt, String diaChi) {
		this.id = id;
		this.ten = ten;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "Khach hang { \n"
				+ "\t id = " + this.id + ",\n"
				+ "\t ten = " + this.ten + ",\n"
				+ "\t sdt = " + this.sdt + ",\n "
				+ "\t diaChi = " + this.diaChi + "\n}";
	}
	
	
}
