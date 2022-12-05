/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week5;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("notunuzu girin");
        
        int vize,fnl;
        
        do{
            System.out.println("vize notu");
             vize=scanner.nextInt();
            System.out.println("final notu gir");
             fnl=scanner.nextInt();
        }
        while(vize<=0 || vize>=100 && fnl <=100 && fnl>=0);
               double ort;
               ort=vize* 0.4 + fnl *0.6;
               System.out.println("ort"+ort );
        
        
        
     
        if(ort<=100 && ort>=80){
             System.out.println("AA");
         }
         else if(ort<=80 && ort>=60){
             System.out.println("BB");
         }
         else if(ort<=60 && ort >=40){
                 System.out.println("DD");
    }else{
            System.out.println("FF kaldınız");
         }       
                               
 
     
    }          
             
             
             
}

       
    

