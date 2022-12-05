/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8kenar;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8kenar {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("lütfen AB kenarını giriniz");
    int ab= scanner.nextInt();
    double cb=2*ab/(1+Math.sqrt(5));
    double ac= ab-cb;
    
    System.out.println("ac kenarı="+ac+"cb kenarı="+cb);
    
}
}