/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
   
    // 1. Tao thuoc tinh
    private String ten;
    private int tuoi;
    private String diaChi;
    private double luong;
    private int gioLam;
    
    // 2. Tao Constructor (Ham Tao)
    // --- Gán giá trị cho thuộc tính
    
    // --- Hàm tạo mặc định (Constructor rỗng)
    public NhanVien() {
        System.out.println("Ham tao");
        this.ten = "Khong biet";
        this.tuoi = 1;
        this.diaChi = "";
        this.luong = 0;
        this.gioLam = 0;
    }
    
    // --- Hàm tạo đầy đủ tham số
    public NhanVien(String ten, int tuoi, String diaChi, double luong, int gioLam) {
        System.out.println("Ham tao day du");
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.luong = luong;
        this.gioLam = gioLam;
    }
    
    // 3. Getter/setter
    public String getTen() {
        return ten;
    }  
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public int getGioLam() {
        return gioLam;
    }
    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }
    
    public void inputInfo() {
        System.out.println("--------NHAP THONG TIN--------");
        Scanner input = new Scanner(System.in);
        System.out.print("Ten: ");
        this.ten = input.nextLine();
        System.out.print("Tuoi: ");
        this.tuoi = Integer.parseInt(input.nextLine());
        System.out.print("Dia chi: ");
        this.diaChi = input.nextLine();
        System.out.print("Luong: ");
        this.luong = Double.parseDouble(input.nextLine());
        System.out.print("Gio Lam: ");
        this.gioLam = Integer.parseInt(input.nextLine());
    }
    
    public void printInfo() {
        System.out.println("-------THONG TIN NV----------");
        System.out.println("Ten: " + this.ten);
        System.out.println("Tuoi: " + this.tuoi);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Luong: " + this.luong);
        System.out.println("Gio Lam: " + this.gioLam);
    }
    
    public double tinhThuong() {
        double thuong = 0;
        // tính toán thưởng cho nhân viên
        if (gioLam >= 200) {
            thuong = luong * 0.2;
        } else if (gioLam >= 100) {
            thuong = luong * 0.1;
        } else {
            thuong = 0;
        }
        return thuong;
    }
}
}
