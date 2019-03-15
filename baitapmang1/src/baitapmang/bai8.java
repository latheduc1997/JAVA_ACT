/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapmang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai8 {
    public static void main(String[] args) {
          int m, n;
    int j;
    int i;
     
    Scanner scanner = new Scanner(System.in);
         
    
         
    int[][] B = new int[3][3];
    for ( i = 0; i < 3; i++) {
        for ( j = 0; j < 3; j++) {
            System.out.print(" [" + i + ", " + j + "]: ");
            B[i][j] = scanner.nextInt();
        }
    }
         System.out.println("Mảng vừa nhập: ");
       for ( i = 0; i < 3; i++) {
        for ( j = 0; j < 3; j++) {
            System.out.print(B[i][j] + "\t");
        }
    }
    
   
           
}
}
