/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8tahmin;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8tahmin {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    Random r=new Random(); //random sınıfı
     int a=r.nextInt(100);
    for (int i = 0; i < 10; ) {
    System.out.println("lütfen sayıyı tahmin ediniz");
    int girilensayi = scanner.nextInt();
     
    if(a==girilensayi){
    System.out.println("doğru bildiniz"); 
    i=10;
    }
    else if (a>girilensayi){
    System.out.println("sayınız küçük tekrar girin");  
    }
    else  if(a<girilensayi){
    System.out.println("sayınız büyük tekrar girin");  
    }
    }
    }
}
