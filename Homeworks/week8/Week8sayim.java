/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8sayim;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8sayim {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("lütfen sayı giriniz");
    int a= scanner.nextInt();
        for (int i = 2; i < a; i++) {
            if (a%i==0) {
                 
    System.out.println(i);
            }
        }
    }
}
