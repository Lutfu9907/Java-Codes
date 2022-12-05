/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8perfectnumber;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8perfectnumber {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("sayıyı giriniz");
    int u= scanner.nextInt();
    int toplam =0;
        for (int i = 1; i < u; i++) {
            
                if (u%i==0) {
                    toplam+=i;
                    
      
        }
        }
         if (u==toplam) {
                System.out.println("girdiğiniz sayı mükkemmel sayıdır");    
                    
      
        }
    }
}
