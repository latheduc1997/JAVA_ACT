package edu.fithou.java.dto;

import java.io.Serializable;

public class NhaSanXuat implements Serializable{

	private Long id;
	
	private String ten;
	
	private String diaChi;
	
	public NhaSanXuat() {
		// TODO Auto-generated constructor stub
	}

	public NhaSanXuat(Long id, String ten, String diaChi) {
		super();
		this.id = id;
		this.ten = ten;
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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "Nha san xuat{ \n"
				+ "\t id = " + id + ",\n"
				+ "\t ten = " + ten + ",\n"
				+ "\t diaChi = " + diaChi + "\n}";
	}
	
	
}
