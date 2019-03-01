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
public class bai1 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[5];
        int tong = 0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Phan tu %d: ", i);
            A[i] = input.nextInt();
            tong = tong + A[i];

        }
        System.out.println("tong mang la " + tong);
        System.out.println("---------- ");
        int tongle=0;
        int tongchan=0;
        for(int i=0;i<5;i++){
            if(A[i]%2==1){
               
                tongle =tongle+A[i];
            }
            
             
        
        System.out.println("tong le"+tongle);
        System.out.println("tong chan"+tongchan);
    }
    
         
    }
}

