/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapmang1chieu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mitco
 */
public class bai4 {
    public static void main(String[] args) {
        
    
    int[] a = new int[8];
        Random rd=new Random();
        Scanner sc = new Scanner(System.in);
        int i,tempSort;
        int n=8;
        int j;
         for ( i = 0; i <n; i++)
        {
            a[i] = rd.nextInt(100);
            System.out.print(a[i]+" ");
         }
         //////tang dan
        for ( i = 0; i < n - 1; i++) {
        for ( j = n - 1; j >= 1; j--) {
            
            if (a[j] < a[j - 1]) {
                tempSort = a[j];
                a[j] = a[j-1];
                a[j-1] = tempSort;
            }
        }
    }   
         System.out.println("\nMảng sau khi sắp xếp tang : ");
    
    for ( i = 0; i < n; i++) {
        System.out.print(a[i] + " "); 
        
    } 
    /////sap xep giam
     int temp = a[0];
        for ( i = 0 ; i < a.length - 1; i++) {
            for ( j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp giam: ");
    
    for ( i = 0; i < n; i++) {
        System.out.print(a[i] + " ");  
    }
        System.out.println("");
    int demchan = 0;
    int demle=0;
            for (i=0;i<n;i++){
                if (a[i]%2==0){
                  demchan++;
     }
                else{
                    demle++;
                }
    }
            System.out.println("so chan" + demchan);
            System.out.println("so le" +demle);
}
}

     

      

      
