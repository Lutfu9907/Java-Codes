/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week4;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week4 {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int x;
        do{
            System.out.println("sayı gir");
               x=scanner.nextInt();
                                  
        }while(x<=0 || x>=100);{
            System.out.println("correct"+x);   
        }
        } 
    }
        
    

