/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8dogruparcasi;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8dogruparcasi {
 public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    
    System.out.println("lütfen doğru parçasını giriniz");
    int u= scanner.nextInt();
  double b=u/(2+Math.sqrt(2));
  double a=u-b;
  
    
    System.out.println("gümüş orana göre doğru parçaları"+a+"-"+b);
    }
}
