/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8hibritnumber;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8hibritnumber {

   public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("lütfen sayısı giriniz");
    int x= scanner.nextInt();
     
    int toplam=1;
   
        for (int i = 1; i <= x; i++) {
        toplam=4*i+1;
            if (toplam==x) {
                System.out.println("hibrit sayıdır");
            }
      
        } 
       
    }
}
