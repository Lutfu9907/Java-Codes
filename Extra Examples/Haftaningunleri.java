/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.haftaningunleri;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Haftaningunleri {

    public static void main(String[] args) {
       Scanner gun=new Scanner(System.in);
       
       int sayi1,sayi = 0;
     
     
       System.out.println("sayı gir");
        sayi1=gun.nextInt();
       
       
    
    if(sayi1==1)
    System.out.println("pazartesi");
    
     else if(sayi1==2)
    System.out.println("salı");
    
     else if(sayi1==3)
    System.out.println("çarşamba");
    
     else if(sayi1==4)
    System.out.println("perşembe");
    
     else if(sayi1==5)
    System.out.println("cuma");
    
     else if(sayi1==6)
    System.out.println("cumartesi");
    
     else if(sayi1==7)
    System.out.println("pazar");
    
    else
       System.out.println("hata");
    }
    
}
    
    
    
    

