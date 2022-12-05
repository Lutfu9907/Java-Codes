/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.karetoplami;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Karetoplami {

    public static void main(String[] args) {
        int s = 1;
        int n = input.nextInt();
        int tektoplam = 0;
        int cifttoplam = 0;
        Scanner toplam = new Scanner(System.in);
        System.out.print("Sayı Gir:");
            
         
             
        while (s<=n){
           
            if (s%2 ==0){
                cifttoplam =cifttoplam +s;
            }
            else{
                tektoplam=tektoplam +s;
            }
        }
            
      
       
        System.out.println("Sayıların Toplamı = " + toplam);
    } 
    }
   
