/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8fibonacci;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8fibonacci {

     public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
        System.out.println("lütfen değer giriniz");
        int x = scanner.nextInt();
        int a=0;
        int b=1;
        int c=1;
      System.out.println("fibonacci asal sayıları");
        for (int i = 1; i < x; i++) { 
            for (int j = 1; j <a; j++) {
                if (a%j==0) {
                
                System.out.print(a+"-");
            }
            }
            c=a;
            a=b;
            b+=c;
           
            
        }
    }
}
