/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8tau;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8Tau {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
        System.out.println("lütfen değer giriniz");
        int x = scanner.nextInt();
        int sayac=0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                  if (i%j==0) {
                sayac++;
                              }
                 
            }if (i%sayac==0) {
               System.out.println(i+"sayısı tau sayısıdır"); 
                              }  
            
           
        }
       
    }
}
