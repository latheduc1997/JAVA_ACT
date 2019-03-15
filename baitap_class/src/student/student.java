/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Admin
 *////đề bài

//- Mã sinh viên: chứa 8 kí tự
///- Điểm trung bình: từ0.0 – 10.0 
///- Tuổi: Phải lớn hơn hoặc bằng 18 
///- Lớp: Phải bắt đầu bởi kí tự‘A’ hoặc kí tự‘C’ 
///*Constructorkhông tham số. Constructor đầy đủtham số. Các hàm get/set
///a. phương thức inputInfo(), nhập thông tin Student từbàn phím 
///b. phương thức showInfo(), hiển thịtất cảthông tin Student 
///c. Viết phương thức xét xem Student có được học bổng không? Điểm trung bình 
//trên 8.0 là được học bổng// 
public class student {

    private String msv;
    private double dtb;
    private int age;
    private String lop;

    public student() {
    
    }
    public student(String msv, double dtb, int age, String lop) {
        this.msv = msv;
        this.dtb = dtb;
        this.age = age;
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public boolean isMsv(String msv) {
        return msv.length()==8 ? true : false;
    }
    
    public boolean isDtb(double dtb) {
        return (dtb>=0.0 && dtb<=10.0) ? true : false;
    }
    
    public boolean isAge(int tuoi) {
        return (tuoi>0 && tuoi<=18) ? true : false;
    }
    
    public boolean isLop(String lop) {
        return (lop.startsWith("A") || lop.startsWith("C")) ? true : false;
    }
            
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhap msv : ");
            this.msv = sc.nextLine();
        }while(!isMsv(this.msv));
        do {
            System.out.print("nhap dtb :");
            this.dtb = Double.parseDouble(sc.nextLine());
        }while(!isDtb(this.dtb));
        do {
            System.out.print("nhap tuoi : ");
            this.age = Integer.parseInt(sc.nextLine());
        }while(!isAge(this.age));
        do {
            System.out.print("nhap lop :");
            this.lop = sc.nextLine();
        }while(!isLop(this.lop));
    }
    
    public void showInfo() {
        System.out.println("--------thong tin sinh vien---------");
        System.out.println("ma sinh vien :"+ this.msv);
        System.out.println("diem trung binh: "+this.dtb);
        System.out.println("tuoi : " +this.age);
        System.out.println("lop: " +this.lop);
    }
    
    public void tinhHocBong() {
       if(this.dtb>8){
           System.out.println("duoc hoc bong ");
       }else{
           System.out.println("khong duoc hoc bong");
       }
    }
}
