/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class tamgiac {
    
    private  int canha;
    private int canhb;
    private int canhc;

    public tamgiac() {
    }
    

    public tamgiac(int canha, int canhb, int canhc) {
        this.canha = canha;
        this.canhb = canhb;
        this.canhc = canhc;
    }

    public int getCanha() {
        return canha;
    }

    public void setCanha(int canha) {
        this.canha = canha;
    }

    public int getCanhb() {
        return canhb;
    }

    public void setCanhb(int canhb) {
        this.canhb = canhb;
    }

    public int getCanhc() {
        return canhc;
    }

    public void setCanhc(int canhc) {
        this.canhc = canhc;
    }
    public void nhapdodai3canh(){
        System.out.println("--------nhap do dai 3 canh------");
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap do dai canh a:");
        this.canha=sc.nextInt();
         System.out.println("nhap do dai canh b:");
        this.canhb=sc.nextInt();
         System.out.println("nhap do dai canh c:");
        this.canhc=sc.nextInt();
        
    }
    public void hiencanh(){
        System.out.println("--------cac canh vua nhap------");
        System.out.println("cạnh a : "+this.canha);
        System.out.println("cạnh b : "+this.canhb);
        System.out.println("cạnh c : "+this.canhc);
    }
    public void xacdinhtamgiac(){
        if ((canha + canhb <= canhc) || (canhb + canhc) <= canha || (canhc + canha) <= canhb)
	{
            System.out.println("tam giac nhap sai");
		
	}
	else // tam giác thường, vuông, cân, vuông cân, đều ta sẽ sắp xếp : Đều->vuông cân->cân->vuông->thường
	{
		if (canha == canhb&&canhb == canhc) //đk tam giác đều
		{
                    System.out.println("tam giac deu");
			
		}
		else if (canha == canhb || canhb == canhc || canhc == canha) // đk tam giác cân ! *notice : trong tam giác cân có vuông cân, cân
		{
			if (canha*canha + canhb*canhb == canhc*canhc || canhb*canhb + canhc*canhc == canha*canha ||
                                canhc*canhc + canha*canha == canhb*canhb)//tam giác vuông cân
			{
		            System.out.println("tam giac vuong can");
			}
			else{
				      System.out.println("tam giac ca");
			}
		}
		else if (canha*canha + canhb*canhb == canhc*canhc || canhb*canhb + canhc*canhc == canha*canha ||
                        canhc*canhc + canha*canha == canhb*canhb)// điều kiên tam giác vuông
		{
	             System.out.println("tam giac vuong");
		}
		else{
                    System.out.println("tam giac thuong");
		}
	
}
    }
    public void chuvitamgiac(){
        int cv;
        cv=canha+canhb+canhc;
        System.out.println("chu vi tam giac la"+cv);
    }
    public void tinhdientichtamgiac(){
        float S; float F;
        F=canha+canhb+canhc;
        S= (float) Math.sqrt(F*(F/2 - canha)*(F/2 - canhb)*(F/2 - canhc)/2);
        System.out.println("dien tich la " +S);
    }
}
