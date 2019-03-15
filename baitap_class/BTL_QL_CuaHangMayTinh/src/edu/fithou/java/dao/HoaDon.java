package edu.fithou.java.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.fithou.java.dto.KhachHang;
import edu.fithou.java.dto.MayTinh;

public class HoaDon {

	private KhachHang khachHang;
	
	private String ngayLap;
	
	private String nhanvien;
	
	private ArrayList<MayTinh> listMayTinh;
	
	public HoaDon() {
		khachHang = new KhachHang();
		listMayTinh = new ArrayList<>();
	}
	
	public void muaMayTinh(Long khachHang_id, Long nhanvien_id) throws ClassNotFoundException, IOException{
		if(DSKhachHang.timkiemKH(khachHang_id) != null && DSNhanVien.timkiemNV(nhanvien_id) != null){
			khachHang = DSKhachHang.timkiemKH(khachHang_id);
			nhanvien = DSNhanVien.timkiemNV(nhanvien_id).getTen();
			System.out.println("nhap ngay lap phieu: ");
			ngayLap = new Scanner(System.in).nextLine();
			int tiepTuc  = 1;
			do {
				System.out.println("nhap ma may tinh can mua");
				Long maytinh_id = new Scanner(System.in).nextLong();
				if(DSMayTinh.timkiemMT(maytinh_id) != null){
					listMayTinh.add(DSMayTinh.timkiemMT(maytinh_id));
				}
				System.out.println("Ban muon tiep tuc muon hay k? 0-ket thuc");
				tiepTuc = new Scanner(System.in).nextInt();
			} while (tiepTuc != 0);
			
			//hien thong tin cua khach hang, nhan vien va danh sach may tinh duoc mua
			System.out.println("thong tin khach hang" + khachHang.toString());
			System.out.println("nhan vien: " + nhanvien);
			System.out.println("ngay lap: " + ngayLap);
			System.out.println("thong tin may mua");
			for (MayTinh mt : listMayTinh) {
				System.out.println("" + mt.toString());
			}
		}else{
			System.err.println("Khong ton tai ma khach hang, hoac ten nhan vien");
		}
	}
}
