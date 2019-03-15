/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class phanso {
private int tuSo;
    private int mauSo;
    Scanner sc = new Scanner(System.in);
    public phanso() {
    }

    public phanso(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    phanso(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
  public void nhapphanso(){
       do {            
            System.out.print("nhap tu so : ");
           this.tuSo=sc.nextInt();
            System.out.print("nhap mau so : ");
            this.mauSo=sc.nextInt();
        } while (this.tuSo==0 || this.mauSo==0);
    }
      public void hienphanso(){
          System.out.println("phan so vua nhap");
          System.out.println(this.tuSo+"/"+this.mauSo);
      }
      public int USCLN(int a, int b){
       int du;
        while(b!=0) {
            du = a%b;
            a=b;
            b=du;
        }
        return a;
    }
     public void rutgon(){
        
        phanso ps = new phanso();
        int tuSo = this.getTuSo()/USCLN(this.getTuSo(), this.getMauSo());
        int mauSo = this.getMauSo()/USCLN(this.getTuSo(), this.getMauSo());
        ps.setTuSo(tuSo);
        ps.setMauSo(mauSo);
       System.out.println("phan so sau khi rut gon: " +tuSo + "/"+mauSo);
       }
     public void congphanso(phanso ps){
         
        int tsc=this.getTuSo()*ps.mauSo+ps.mauSo*ps.tuSo;
        int msc=this.getMauSo()*ps.mauSo;
        phanso phanSoTong = new phanso (tsc, msc);
        phanSoTong.rutgon();
        System.out.println("Tổng hai phân số = " + tsc  + "/" + msc);
         
         
         
         
     }
    

         
    }
   
  
      