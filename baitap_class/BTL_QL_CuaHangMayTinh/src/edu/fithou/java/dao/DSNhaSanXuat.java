package edu.fithou.java.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.fithou.java.data.NhaSanXuatIO;
import edu.fithou.java.dto.NhaSanXuat;
import edu.fithou.java.dto.NhanVien;

public class DSNhaSanXuat {

	private ArrayList<NhaSanXuat> listNhaSanXuat;
	
	public DSNhaSanXuat() {
		listNhaSanXuat = new ArrayList<>();
	}
	
	public void docFile(){
		listNhaSanXuat = NhaSanXuatIO.docFile();
	}
	
	public void ghiFile(){
		NhaSanXuatIO.ghiFile(listNhaSanXuat);
	}
	
	public void hienNSX(){
		for (NhaSanXuat nhaSanXuat : listNhaSanXuat) {
			System.out.println(nhaSanXuat.toString());
		}
	}
	
	/**
	 * kiem tra id da co trong danh sach id hay chua
	 * 
	 * @param id
	 * @return
	 */
	private boolean checkId(Long id) {
		for (NhaSanXuat nsx : listNhaSanXuat) {
			if (nsx.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * them nha san xuat vao danh sach
	 */
	public void themNSX(){
		Scanner sc =  new Scanner(System.in);
		System.out.println("nhap id");
		Long id = sc.nextLong();
		if (checkId(id)) {
			System.out.println("Id: " + id + "Da ton tai!");
		} else {
			sc.nextLine();
			System.out.println("nhap ten: ");
			String ten = sc.nextLine();
			System.out.println("nhap dia chi: ");
			String diaChi = sc.nextLine();
			
			NhaSanXuat nhaSanXuat = new NhaSanXuat(id, ten, diaChi);
			listNhaSanXuat.add(nhaSanXuat);
		}
	}
	
	/**
	 * sua mot nha san xuat theo id
	 * @param id
	 */
	public void suaNSX(Long id){
		Scanner sc = new Scanner(System.in);
		for (NhaSanXuat nhaSanXuat : listNhaSanXuat) {
			if(nhaSanXuat.getId().equals(id)){
				sc.nextLine();
				System.out.println("nhap ten: ");
				String ten = sc.nextLine();
				System.out.println("nhap dia chi: ");
				String diaChi = sc.nextLine();
				
				nhaSanXuat.setTen(ten);
				nhaSanXuat.setDiaChi(diaChi);
			}
		}
	}
	
	/**
	 * xoa nha san xuat theo id
	 * @param id
	 */
	public void xoaNSX(Long id){
		for (int i = 0; i < listNhaSanXuat.size(); i++) {
			if(listNhaSanXuat.get(i).getId().equals(id)){
				listNhaSanXuat.remove(i);
				System.out.println("Xoa thanh cong!");
			}
		}
		System.out.println("Khong tim thay id!");
	}
	
	
	/**
	 * tim kiem nha san xuat theo id
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static NhaSanXuat timkiemNSX(Long id) throws ClassNotFoundException, IOException{
		NhaSanXuat nhaSanXuat = null;
		ArrayList<NhaSanXuat> kq = NhaSanXuatIO.docFile();
		for (NhaSanXuat nsx : kq) {
			if (nsx.getId().equals(id)) {
				nhaSanXuat = nsx;
				break;
			}
		}
		return nhaSanXuat;
	}
	
}
