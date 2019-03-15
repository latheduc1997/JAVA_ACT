package edu.fithou.java.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.fithou.java.data.KhachHangIO;
import edu.fithou.java.dto.KhachHang;

public class DSKhachHang {

	private ArrayList<KhachHang> listKhachHang;

	public DSKhachHang() {
		listKhachHang = new ArrayList<>();
	}

	/**
	 * nhap mot khach hang
	 */
	public void nhapKhachHang() {
		Scanner sc = new Scanner(System.in);
		Long id = (long) listKhachHang.size();
		System.out.println("Nhap ten khach hang:");
		String ten = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		String diaChi = sc.nextLine();
		System.out.println("Nhap so dien thoai: ");
		String sdt = sc.nextLine();
		if (checkSdt(sdt)) {
			KhachHang khachHangDTO = new KhachHang(id, ten, sdt, diaChi);
			listKhachHang.add(khachHangDTO);
		} else {
			System.out.println("So dien thoai sai dinh dang!");
		}
	}

	/**
	 * kiem tra id da co trong danh sach id hay chua
	 * 
	 * @param id
	 * @return
	 */
	private boolean checkId(Long id) {
		for (int i = 0; i < listKhachHang.size(); i++) {
			if (listKhachHang.get(i).getId().equals(id)) {
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
	 * hien toan bo danh sach khach hang
	 */
	public void hienDSKhachHang() {
		for (KhachHang khachHangDTO : listKhachHang) {
			System.out.println(khachHangDTO.toString());
		}
	}

	/**
	 * xoa mot khach hang trong danh sach khach hang
	 * 
	 * @param id
	 */
	public void xoaKhachHang(Long id) {																
		for (int i = 0; i < listKhachHang.size(); i++) {
			if (listKhachHang.get(i).getId().equals(id)) {																																																												
				listKhachHang.remove(i);
				System.out.println("Xoa thanh cong!");
				return;
			}
		}
		System.out.println("Khong tim thay id!");
	}

	/**
	 * chinh sua khach hang boi id nhap vao
	 * 
	 * @param id
	 */
	public void suaKhachHang(Long id) {
		Scanner sc = new Scanner(System.in);
		for (KhachHang khachHangDTO : listKhachHang) {
			if (khachHangDTO.getId().equals(id)) {
				System.out.println("Nhap ten khach hang:");
				String ten = sc.nextLine();
				System.out.println("Nhap dia chi: ");
				String diaChi = sc.nextLine();
				System.out.println("Nhap so dien thoai: ");
				String sdt = sc.nextLine();
				if (checkSdt(sdt)) {
					khachHangDTO.setTen(ten);
					khachHangDTO.setDiaChi(diaChi);
					khachHangDTO.setSdt(sdt);
				} else {
					System.out.println("So dien thoai sai dinh dang!");
				}
				return;
			}
		}
		System.out.println("Khong tim thay id!");
	}

	/**
	 * tim kiem khach hang theo id
	 * 
	 * @param id
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public static KhachHang timkiemKH(Long id) throws ClassNotFoundException, IOException {
		KhachHang khachHangDTO = null;
		ArrayList<KhachHang> kq = KhachHangIO.docFileKhachHang();
		for (KhachHang khachHang : kq) {
			if (khachHang.getId().equals(id)) {
				khachHangDTO = khachHang;
				break;
			}
		}
		return khachHangDTO;
	}

	public static boolean checkKH(String kh) throws ClassNotFoundException, IOException {
		ArrayList<KhachHang> kq = KhachHangIO.docFileKhachHang();
		for (KhachHang khachHang : kq) {
			if (khachHang.getTen().equals(kh)) {
				return true;
			}
		}
		return false;
	}

	public void ghifile() {
		KhachHangIO.ghiFile(listKhachHang);
	}

	public void docFile() {
		for (KhachHang khachHang : KhachHangIO.docFileKhachHang()) {
			listKhachHang.add(khachHang);
		}
	}
}