/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8kenarr;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8Kenarr {

   public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("lütfen kısa kenarını giriniz");
    int f2= scanner.nextInt();
    double ao= (1+Math.sqrt(5))/2;
     int f1=(int)(f2/ao);
     int f3=(int)(f2*ao);
    
    System.out.println(f1+"-"+f2+"-"+f3);
    }
}
