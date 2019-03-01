/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapmang;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai7 {
    public static void main(String[] args) {
        
    int m=3;int n=3;
    int j;
    int i;
     
    Scanner scanner = new Scanner(System.in);
         ///mangA
    int[][] A = new int[3][3];
    for ( i = 0; i < 3; i++) {
        for ( j = 0; j < 3; j++) {
            System.out.print(" [" + i + ", " + j + "]: ");
            A[i][j] = scanner.nextInt();
        }
    }
         System.out.println("Mảng A vừa nhập: ");
       for ( i = 0; i < 3; i++) {
        for ( j = 0; j < 3; j++) {
            System.out.print(A[i][j] + "\t");
        }
        
        System.out.println("\n");  
        
    }
       
       ////MAng B
    int[][] B = new int[3][3];
    for ( i = 0; i < 3; i++) {
        for ( j = 0; j < 3; j++) {
            System.out.print(" [" + i + ", " + j + "]: ");
            B[i][j] = scanner.nextInt();
           }
        }
    
         System.out.println("Mảng B vừa nhập: ");
       for ( i = 0; i < 3; i++) {
           for ( j = 0; j < 3; j++) {
               System.out.print(B[i][j] + "\t");
              }
        
        System.out.println("\n");  
        
      }
       
       //.tong 2 ma tran
        System.out.println("ma tran tong la ");
       int[][] maTranTong = new int[3][3];
            for ( i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    maTranTong[i][j] = A[i][j] + B[i][j];
                   
            
                    System.out.print( maTranTong[i][j]+"\t");
                }
                System.out.println("\n");
            }
                 
    }
}
