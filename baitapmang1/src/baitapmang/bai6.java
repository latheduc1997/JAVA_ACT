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
public class bai6 {
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
System.out.println("Mảng vừa nhập: ");
       for ( i = 0; i < m; i++) {
        for ( j = 0; j < n; j++) {
            System.out.print(A[i][j] + "\t");
        }
        
        System.out.println("\n");   
    }
         
       
       for( i=0;i<n;i++) {
          int sd=0;
           for( j=0;j<m;j++){
           sd=sd+A[i][j];
        }
       
      System.out.println("tong dong "+ i +"="+sd);
   
}
       for( i=0;i<m;i++){
       int sc=0;
     for(j=0;j<n;j++)
      {
      sc=sc+A[j][i];
      }
           System.out.println("tong cot"+ i +"="+sc);
}
}
}


