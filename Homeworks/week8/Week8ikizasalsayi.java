/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8ikizasalsayi;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8ikizasalsayi {

     public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("aralığı belirtin");
    int u= scanner.nextInt();
    int k=0;
    boolean asal=true;
    boolean sal2=true;
        for (int i = 2; i < u; i++) {
            for (int j = 2; j < i; j++) {
                k+=2;
                if (k%j==0) {
                    sal2=false;
                }
                if (i%j==0) {
                    asal=false;
                    
                }
            }
            if (asal==true && sal2==true) {
                System.out.println(i+" ile "+k+" ikiz asal sayılardır");
            }
            else{ 
             System.out.println(" ikiz asal sayı değildir");
            }
        }
    }
}
