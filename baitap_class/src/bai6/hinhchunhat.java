/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class hinhchunhat {
    private int chieudai;
    private int chieurong;

    public hinhchunhat() {
    }
    

    public hinhchunhat(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    

    public int getChieudai() {
        return chieudai;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }
    
    public void nhap(){
        System.out.println("---------nhap thong tin--------");
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap chieu dai : " );
        this.chieudai=sc.nextInt();
        System.out.println("nhap chieu rong : ");
        this.chieurong=sc.nextInt();
        
    }
    public void hien(){
        System.out.println("----------hinh chu nhat vua nhap------");
        System.out.println("chieu dai"+this.chieudai);
        System.out.println("chieu rong"+this.chieurong);
    }
        public void tinhchuvi(){
            int chuvi;
            chuvi=(chieudai+chieurong)*2;
            System.out.println("chu vi : "+chuvi);
        }    
    public void tinhdientich(){
        int dientich;
        dientich =chieudai*chieurong;
        System.out.println("dien tich : "+dientich);
    }
