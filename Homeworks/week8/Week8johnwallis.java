/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8johnwallis;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8johnwallis {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
   
   
    System.out.println("lütfen harfi tahmin ediniz");
    int n = scanner.nextInt();
    int c=1;
    
        for (int i = 1; i < n; i++) {
             int c1=4*i*i;
            c=c*c1/(c1-1);
        }
       System.out.println("john wallis gösterimi"+2*c);
    }
}
