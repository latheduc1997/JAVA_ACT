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
public class bai2 {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int[] a = new int[5];
        int i;
         for(i=0;i<5;i++){
             
          System.out.printf("Phan tu %d: ", i);
            a[i] = sc.nextInt();}
      
         int max=a[0];
         int min=a[0];
         
         for(i=0;i<5;i++)
         {
	  if (a[i] > max)
         max = a[i];
          if (a[i] < min)
         min = a[i];
         }
           int chia3=a[0];
           for(i=0;i<5;i++)
           {
               if(a[i]%3==0)
                   chia3=a[i];
           }
                
	        System.out.println("phan tu max mang " +max);
                System.out.println("phan tu  min "  +min);
                System.out.println("phan tu chia het 3" +chia3);
                
}
     }

         


