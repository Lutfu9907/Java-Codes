/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8armstrong;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8armstrong {

    
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("lütfen değer giriniz");
    int x = scanner.nextInt();
     int mod=1;
     int n=x;
     int toplam=0;
     while(n>0){
     mod= n%10;
     n=n/10;
    
        mod= mod*mod*mod;
    
        toplam=toplam+mod;
        
    }   
    if (toplam==x) {
            System.out.println(x+"armstong sayısınıdır");
        }
        
    }
}
