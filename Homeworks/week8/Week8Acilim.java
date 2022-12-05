/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8acilim;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8Acilim {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("lütfen ln değerini giriniz");
    int n = input.nextInt();
     
    double toplam=1;
   
   
        for (int i = 1; i <= n-1; i++) {
            toplam=toplam+1/((2*i)*(2*i+2));
        }
        System.out.println("ln açılım sonucu "+toplam);
    }
}
