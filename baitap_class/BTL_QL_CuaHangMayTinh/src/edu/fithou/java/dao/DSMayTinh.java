package edu.fithou.java.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.fithou.java.data.KhachHangIO;
import edu.fithou.java.data.MayTinhIO;
import edu.fithou.java.dto.ILoaiMayTinh;
import edu.fithou.java.dto.MayTinh;

public class DSMayTinh {

	private ArrayList<MayTinh> listMayTinh;

	public DSMayTinh() {
		listMayTinh = new ArrayList<>();
	}

	public void hienDS() {
		for (MayTinh mayTinh : listMayTinh) {
			System.out.println(mayTinh.toString());
		}
	}

	/**
	 * nhap mot may tinh
	 */
	public void nhapMayTinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id may tinh");
		Long id = sc.nextLong();
		if (checkId(id)) {
			System.out.println("Id: " + id + "Da ton tai!");
		} else {
			sc.nextLine();
			System.out.println("Nhap ten may tinh: ");
			String ten = sc.nextLine();
			System.out.println("Nhap cau hinh: ");
			String cauHinh = sc.nextLine();
			System.out.println("Nhap loai May Tinh (1 hoac 2)");
			System.out.println("1. May Moi");
			System.out.println("2. May cu");
			int chon = sc.nextInt();
			String loaiMT = null;
			switch (chon) {
			case 1:
				loaiMT = ILoaiMayTinh.mayMoi;
				break;
			case 2:
				loaiMT = ILoaiMayTinh.mayCu;
				break;
			default:
				System.out.println("nhap 1 hoac 2!");
				break;
			}
			System.out.println("Nhap gia:");
			Float gia = sc.nextFloat();

			MayTinh mayTinh = new MayTinh(id, ten, cauHinh, loaiMT, gia);
			listMayTinh.add(mayTinh);
		}
	}

	/**
	 * kiem tra id da ton tai trong danh sach hay k
	 * 
	 * @param id
	 * @return
	 */
	private boolean checkId(Long id) {
		for (MayTinh mayTinh : listMayTinh) {
			if (mayTinh.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public void docFile() {
		listMayTinh = MayTinhIO.docFile();
	}

	public void ghiFile() {
		MayTinhIO.ghiFile(listMayTinh);
	}

	/**
	 * xoa 1 may tinh boi id
	 * 
	 * @param id
	 */
	public void xoaMayTinh(Long id) {
		for (int i = 0; i < listMayTinh.size(); i++) {
			if(listMayTinh.get(i).equals(id)){
				listMayTinh.remove(i);
				System.out.println("Xoa thanh cong!");
			}
		}
		System.out.println("Khong tim thay id!");
	}

	/**
	 * sua thong tin may tinh
	 * 
	 * @param id
	 */
	public void suaMayTinh(Long id) {
		Scanner sc = new Scanner(System.in);
		for (MayTinh mayTinh : listMayTinh) {
			if (mayTinh.getId().equals(id)) {
				System.out.println("Nhap ten may tinh: ");
				String ten = sc.nextLine();
				System.out.println("Nhap cau hinh: ");
				String cauHinh = sc.nextLine();
				System.out.println("Nhap loai May Tinh (1 hoac 2)");
				System.out.println("1. May Moi");
				System.out.println("2. May cu");
				int chon = sc.nextInt();
				String loaiMT = null;
				switch (chon) {
				case 1:
					loaiMT = ILoaiMayTinh.mayMoi;
					break;
				case 2:
					loaiMT = ILoaiMayTinh.mayCu;
					break;
				default:
					System.out.println("nhap 1 hoac 2!");
					break;
				}
				System.out.println("Nhap gia:");
				Float gia = sc.nextFloat();

				mayTinh.setTen(ten);
				mayTinh.setCauHinh(cauHinh);
				mayTinh.setLoaiMT(loaiMT);
				mayTinh.setGia(gia);
			}
		}
	}

	public static MayTinh timkiemMT(Long id) throws ClassNotFoundException, IOException {
		MayTinh maytinh = null;
		ArrayList<MayTinh> kq = MayTinhIO.docFile();
		for (MayTinh mt : kq) {
			if (mt.getId().equals(id)) {
				maytinh = mt;
				break;
			}
		}
		return maytinh;
	}
}
