package edu.fithou.java.dto;

import java.io.Serializable;

public class NhanVien implements Serializable{

	private Long id;
	
	private String email;
	
	private String ten;
	
	private String sdt;
	
	private String diaChi;
	
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
		
	public NhanVien(Long id, String ten, String email, String sdt, String diaChi) {
		this.id = id;
		this.ten = ten;
		this.email = email;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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
		return "Nhan vien { \n"
				+ "\t id = " + id + ",\n"
				+ "\t ten = " + ten + ", \n "
				+ "\t email = " + email + ",\n"
				+ "\t sdt = " + sdt + ", \n"
				+ "\t diaChi = " + diaChi
				+ "\n}";
	}
	
	
}
