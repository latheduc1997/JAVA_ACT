package edu.fithou.java.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.fithou.java.data.NhanVienIO;
import edu.fithou.java.dto.NhanVien;

public class DSNhanVien {

	private ArrayList<NhanVien> listNhanVien;

	public DSNhanVien() {
		listNhanVien = new ArrayList<>();
	}

	public void docFile() {
		listNhanVien = NhanVienIO.docFile();
	}

	public void ghiFile() {
		NhanVienIO.ghiFile(listNhanVien);
	}

	public void hienDS() {
		for (NhanVien nhanVien : listNhanVien) {
			System.out.println(nhanVien.toString());
		}
	}

	/**
	 * kiem tra id da co trong danh sach id hay chua
	 * 
	 * @param id
	 * @return
	 */
	private boolean checkId(Long id) {
		for (NhanVien nv : listNhanVien) {
			if (nv.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * kiem tra xem so dien thoai du 10 so hay khong
	 * 
	 * @param sdt
	 * @return
	 */
	private boolean checkSdt(String sdt) {
		if (sdt.length() == 10) {
			for (int i = 0; i < sdt.length(); i++) {
				if (!Character.isDigit(sdt.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * them mot nhan vien vao danh sasch
	 */
	public void themNV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap id");
		Long id = sc.nextLong();
		if (checkId(id)) {
			System.out.println("Id: " + id + "Da ton tai!");
		} else {
			sc.nextLine();
			System.out.println("nhap ten: ");
			String ten = sc.nextLine();
			System.out.println("Nhap email: ");
			String email = sc.nextLine();
			System.out.println("nhap dia chi: ");
			String diaChi = sc.nextLine();
			System.out.println("nhap so dien thoai");
			String sdt = sc.nextLine();
			if (checkSdt(sdt)) {
				NhanVien nhanVien = new NhanVien(id, ten, email, sdt, diaChi);
				listNhanVien.add(nhanVien);
			} else {
				System.out.println("So dien thoai sai dinh dang!");
			}
		}
	}

	/**
	 * Sua mot nhan vien theo id
	 * 
	 * @param id
	 */
	public void suaNV(Long id) {
		Scanner sc = new Scanner(System.in);
		for (NhanVien nhanVien : listNhanVien) {
			if (nhanVien.getId().equals(id)) {
				System.out.println("nhap ten: ");
				String ten = sc.nextLine();
				System.out.println("Nhap email: ");
				String email = sc.nextLine();
				System.out.println("nhap dia chi: ");
				String diaChi = sc.nextLine();
				System.out.println("nhap so dien thoai");
				String sdt = sc.nextLine();
				if (checkSdt(sdt)) {
					nhanVien.setTen(ten);
					nhanVien.setEmail(email);
					nhanVien.setDiaChi(diaChi);
					nhanVien.setSdt(sdt);
				} else {
					System.out.println("So dien thoai sai dinh dang!");
				}
			}
		}
	}

	/**
	 * xoa mot nhan vien theo id
	 * 
	 * @param id
	 */
	public void xoaNV(Long id) {
		for (int i = 0; i < listNhanVien.size(); i++) {
			if(listNhanVien.get(i).equals(id)){
				listNhanVien.remove(i);
				System.out.println("Xoa thanh cong!");
			}
		}
		System.out.println("Khong tim thay id!");
	}

	/**
	 * tim kiem mot nhan vien theo id
	 * 
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static NhanVien timkiemNV(Long id) throws ClassNotFoundException, IOException {
		NhanVien nhanVien = null;
		ArrayList<NhanVien> kq = NhanVienIO.docFile();
		for (NhanVien nv : kq) {
			if (nv.getId().equals(id)) {
				nhanVien = nv;
				break;
			}
		}
		return nhanVien;
	}
	
	/**
	 * kiem tra ten nhan vien co trong ds nhan vien hay khong
	 * @param nv
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static boolean checkNV(String nv) throws ClassNotFoundException, IOException{
		ArrayList<NhanVien> kq = NhanVienIO.docFile();
		for (NhanVien nvien : kq) {
			if (nvien.getTen().equals(nv)) {
				return true;
			}
		}
		return false;
	}
}
