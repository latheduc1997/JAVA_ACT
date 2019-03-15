package edu.fithou.java.dto;

import java.io.Serializable;

public class MayTinh implements Serializable, ILoaiMayTinh{

	private Long id;
	
	private String ten;
	
	private String cauHinh;
	
	private String loaiMT;
	
	private Float gia;
	
	public MayTinh() {
		// TODO Auto-generated constructor stub
	}

	public MayTinh(Long id, String ten, String cauHinh, String loaiMT, Float gia) {
		super();
		this.id = id;
		this.ten = ten;
		this.cauHinh = cauHinh;
		this.loaiMT = loaiMT;
		this.gia = gia;
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

	public String getCauHinh() {
		return cauHinh;
	}

	public void setCauHinh(String cauHinh) {
		this.cauHinh = cauHinh;
	}

	public String getLoaiMT() {
		return loaiMT;
	}

	public void setLoaiMT(String loaiMT) {
		this.loaiMT = loaiMT;
	}

	public Float getGia() {
		return gia;
	}

	public void setGia(Float gia) {
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "May tinh { \n"
				+ "\t id = " + id + ",\n"
				+ "\t ten = " + ten + ",\n"
				+ "\t cauHinh = " + cauHinh + ",\n"
				+ "\t loaiMT = " + loaiMT + ",\n"
				+ "\t gia = " + gia
				+ "\n}";
	}
	
	
}
