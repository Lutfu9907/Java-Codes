/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sayilar;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Sayilar {

    public static void main(String[] args) {
     
        Scanner klavye =new Scanner(System.in);  
        
        int kalan ,toplam = 0;
        System.out.println("sayı gir");
        int sayi =klavye.nextInt();
        while(sayi>0){
         
            kalan=sayi%10;
            toplam=toplam+kalan;
            sayi=sayi/10;
            
        }
                System.out.println("."+toplam);
            }
           
            }
        
            
    

