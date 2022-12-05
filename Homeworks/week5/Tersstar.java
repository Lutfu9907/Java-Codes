/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tersstar;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Tersstar {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
           int row;
      do {
          System.out.println("satır sayısı gir");
          row=input.nextInt();
      }while(row%2==0);
      int col=row;
        for (int i = 1; i <= row; i++) {
            if(i==1 || i==row){
                for (int j = 1; j <=col; j++) {
                    System.out.print("*"); 
                }
            }
            else{
                for (int j = 0; j <=col; j++) {
                    if(j==col ||j==1) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
      

        
    }

    
}