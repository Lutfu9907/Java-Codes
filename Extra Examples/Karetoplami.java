/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.karetoplami;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Karetoplami {

    public static void main(String[] args) {
        
        
        Scanner kare = new Scanner(System.in);
        System.out.print("Sayı Gir:");
 
        int sayi = kare.nextInt();
        int toplam = 0;
        for(int i = 1; i <= sayi; ++i)
        {
            toplam += i;
        }
 
        System.out.println("Sayıların Toplamı = " + toplam);
    } 
    }
   
