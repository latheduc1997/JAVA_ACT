/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapmang1chieu;

import java.util.Scanner;

/**
 *
 * @author mitco
 */
public class bai3 {
    public static void main(String[] args) {
        
    
       Scanner sc=new Scanner (System.in);
        int[] a = new int[5];
        int i;
      System.out.println("nhap so: ");
        int num = sc.nextInt();
        for(i=0;i<5;i++)
        {
             System.out.printf("Phan tu %d: ", i);
            a[i] = sc.nextInt();
           
        }
        
    }
}
