/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8brothers;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8brothers {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
     System.out.println("lütfen terim sayısını giriniz");
    int n = scanner.nextInt();
    int t =2;
    int f=1;
    for (int i = 1; i < n;i++ ) {
       
            
            f*=2*i+1;
          
        
   
       t=t+(2*i+2)/f;
    }
     System.out.println("Brothers formülüne göre değerin sonucu= "+t);
    }
}
