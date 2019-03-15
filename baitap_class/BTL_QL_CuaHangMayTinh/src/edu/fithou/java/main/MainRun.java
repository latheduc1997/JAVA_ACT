package edu.fithou.java.main;

import java.io.IOException;
import java.util.Scanner;

import edu.fithou.java.dao.DSKhachHang;
import edu.fithou.java.dao.DSMayTinh;
import edu.fithou.java.dao.DSNhaSanXuat;
import edu.fithou.java.dao.DSNhanVien;
import edu.fithou.java.dao.HoaDon;
import edu.fithou.java.dto.KhachHang;

public class MainRun {

	public static void menu() {
		System.out.println("QUAN LY KHACH HANG");
		System.out.println("1. Hien danh sach");
		System.out.println("2. Them");
		System.out.println("3. Sua");
		System.out.println("4. Xoa");
		System.out.println("5. doc file");
		System.out.println("6. ghifile");
//		System.out.println("QUAN LY NHAN VIEN");
//		System.out.println("7. Hien danh sach");
//		System.out.println("8. Them");
//		System.out.println("9. Sua");
//		System.out.println("10. Xoa");
//		System.out.println("11. doc file");
//		System.out.println("12. ghifile");
//		System.out.println("QUAN LY NHA CUNG CAP");
//		System.out.println("13. Hien danh sach");
//		System.out.println("14. Them");
//		System.out.println("15. Sua");
//		System.out.println("16. Xoa");
//		System.out.println("17. doc file");
//		System.out.println("18. ghifile");
//		System.out.println("QUAN LY MAY TINH");
//		System.out.println("19. Hien danh sach");
//		System.out.println("20. Them");
//		System.out.println("21. Sua");
//		System.out.println("22. Xoa");
//		System.out.println("23. doc file");
//		System.out.println("24. ghifile");
//		System.out.println("25. MUA MAY TINH");
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException{
		DSKhachHang dsKhachHang = new DSKhachHang();
		DSNhanVien dsNhanVien = new DSNhanVien();
		DSNhaSanXuat dsNhaSanXuat = new DSNhaSanXuat();
		DSMayTinh dsMayTinh = new DSMayTinh();
		HoaDon hoaDon = new HoaDon();

		int chon;
		do {
			menu();
			System.out.println("hay chon so!");
			chon = new Scanner(System.in).nextInt();
			switch (chon) {
				//KHACH HANG
				case 1:
					System.out.println("DANH SACH KHAC HANG");
					dsKhachHang.hienDSKhachHang();
					break;
				case 2:
					System.out.println("nhap thong tin khach");
					dsKhachHang.nhapKhachHang();
					break;
				case 3:
					System.out.println("nhap id khach hang can sua");
					Long suaKH = new Scanner(System.in).nextLong();
					dsKhachHang.suaKhachHang(suaKH);
					break;
				case 4:
					System.out.println("nhap id khach hang can xoa!");
					Long xoaKH = new Scanner(System.in).nextLong();
					dsKhachHang.xoaKhachHang(xoaKH);
					break;
				case 5:
					dsKhachHang.docFile();
					break;
				case 6:
					dsKhachHang.ghifile();
					break;
				//NHAN VIEN
				case 7:
					System.out.println("DANH SACH NHAN VIEN");
					dsNhanVien.hienDS();
					break;
				case 8:
					System.out.println("nhap thong tin nhan vien");
					dsNhanVien.themNV();
					break;
				case 9:
					System.out.println("Nhpa id can sua");
					Long suaNV = new Scanner(System.in).nextLong();
					dsNhanVien.suaNV(suaNV);
					break;
				case 10:
					System.out.println("nhap id nhan vien can xoa");
					Long xoaNV = new Scanner(System.in).nextLong();
					dsNhanVien.xoaNV(xoaNV);
					break;
				case 11:
					dsNhanVien.docFile();
					break;
				case 12:
					dsNhanVien.ghiFile();
					break;
				
				//NHA SAN XUAT
				case 13:
					System.out.println("DANH SACH NHA SAN XUAT");
					dsNhaSanXuat.hienNSX();
					break;
				case 14:
					System.out.println("nhap thong tin can them");
					dsNhaSanXuat.themNSX();
					break;
				case 15:
					System.out.println("nhap id can sua");
					Long suaNSX = new Scanner(System.in).nextLong();
					dsNhaSanXuat.suaNSX(suaNSX);
					break;
				case 16:
					System.out.println("nhap id can xoa");
					Long xoaNSX = new Scanner(System.in).nextLong();
					dsNhaSanXuat.xoaNSX(xoaNSX);
					break;
				case 17:
					dsNhaSanXuat.docFile();
					break;
				case 18:
					dsNhaSanXuat.ghiFile();
					break;
					//MAY TINH
				case 19:
					System.out.println("DANH SACH MAY TINH");
					dsMayTinh.hienDS();
					break;
				case 20:
					System.out.println("nhap thong tin can them");
					dsMayTinh.nhapMayTinh();
					break;
				case 21:
					System.out.println("nhap id may tinh can sua");
					Long suaMT = new Scanner(System.in).nextLong();
					dsMayTinh.suaMayTinh(suaMT);
					break;
				case 22:
					System.out.println("nhap id may tinh can xoa");
					Long xoaMT = new Scanner(System.in).nextLong();
					dsMayTinh.xoaMayTinh(xoaMT);
					break;
				case 23:
					dsMayTinh.docFile();
					break;
				case 24:
					dsMayTinh.ghiFile();
					break;
					//mua may tinh
				case 25:
					System.out.println("Mua May tinh");
					System.out.println("Nhap id khach hang");
					Long khachHang_id = new Scanner(System.in).nextLong();
					System.out.println("Nhap id nhan vien");
					Long nhanvien_id = new Scanner(System.in).nextLong();
					hoaDon.muaMayTinh(khachHang_id, nhanvien_id);
					break;
				default:
					break;
			}
			System.out.println("Muon tiep tuc k?");
			chon = new Scanner(System.in).nextInt();
		} while (chon != 0);
	}
}
