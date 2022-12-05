/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ucgen;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Ucgen {

    public static void main(String[] args) {  
        
         Scanner Ucgen = new Scanner (System.in);
         System.out.println("ilk kenarı gir");
         int a=Ucgen.nextInt();
         
         System.out.println("ikinci kenarı gir");
         int b =Ucgen.nextInt();
         
         System.out.println("üçüncü kenarı gir");
         int c=Ucgen.nextInt();
         
         
         if (a==b || b==c)
             System.out.println("eşkenar üçgen");
         
         else if (a==b || b==c || a==c)
             System.out.println("ikizkenar üçgen");
             
                 else
                 System.out.println("çeşitkenar üçgen");
         
                     
             }
         }
         
    
         
         
         
         
                     
       
    
    
   

