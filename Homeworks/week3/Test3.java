/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test3;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Test3 {

    public static void main(String[] args) {
     Scanner scanner =new Scanner(System.in);
        System.out.println("sayı gir");
       
     int fakt=1;
     int sayi=scanner.nextInt();
     
     for(int i=1; i<=sayi; i++){
           
         
         fakt *= 1;
         
         System.out.println("fakt=" +fakt+ "i=" +i);
     }
        System.out.println("fakt"+fakt );
     }
      
          
      
    
    }

