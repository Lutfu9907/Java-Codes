/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week6;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week6 {

    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.println(".");
       
      int a,b,islem;
 
        b = scanner.nextInt();

        a = scanner.nextInt();
    
        
        do{
               System.out.println("a değerini girin");
               a = scanner.nextInt();
               System.out.println("b değerini girin");
               b=scanner.nextInt();
        }
        
        while(a<=1 && a>=100);{
               
               b=a*a*a-a*a;
               System.out.println("b="+b);
               
    }
    }
    
    
}