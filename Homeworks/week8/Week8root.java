/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8root;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8root {

   public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("lütfen n sayısını giriniz");
    int n = scanner.nextInt();
    double t =1;
    
    
        for (int i = 1; i < n; i++) {
           t=2+(1/t);
        
        }
        t=1+(1/t);
        System.out.println("kök 2 değerininin bölüm sayısına göre değeri "+t);
    }
}
