/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8binom;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8binom {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("lütfen x açısını giriniz");
    int x = input.nextInt();
     System.out.println("lütfen kaça kadar açılcağını giriniz");
    int n = input.nextInt();
    int a=1;
    double toplam=0;
    double fak=1;
    int genelx=1;
    
        for (int i = 1; i <= n; i++) {
           toplam+=1+x/n ;
          
           
            
        }
        System.out.println("limit binom açılımı "+toplam);
   
    }
}
