/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loop;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Loop {

    public static void main(String[] args) {
       Scanner  scanner = new Scanner(System.in);
        System.out.println("sayı gir");
        
        int sayi=scanner.nextInt();
        int toplam=0; 
        
        do{
            toplam+=sayi %10;
            sayi /=10;
            System.out.println("sayi" +sayi);
            
        }while(sayi>0);
        System.out.println("toplam" +toplam);
        
        
        
        
        
    }
}
