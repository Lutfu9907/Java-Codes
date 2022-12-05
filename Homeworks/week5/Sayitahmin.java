/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sayitahmin;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Sayitahmin {

    private static int bs;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args, int var) {

       Scanner scanner=new Scanner(System.in);
       random rnd=new random();
        int tahmin;
        tahmin = scanner.nextInt(var);
        int random = 0;
       do{
           System.out.println("tahmin");
           tahmin=scanner.nextInt();tahmin++;
           
           
           if(tahmin>random){
               System.out.println(" daha küçük sayı gir");
           }
           else if(tahmin<random){
       }        System.out.println("daha büyük sayı gr");
               System.out.println(" ");
               }
           while(tahmin!=bs);
        
           System.out.println("");
    }
}
