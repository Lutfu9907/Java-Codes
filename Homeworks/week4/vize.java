/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.week4;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class vize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int not=scanner.nextInt();
        System.out.println("notunuzu girin");
     
        if(not<=100 || not>=80){
             System.out.println("AA");
         }
         else if(not<=80 || not>=60){
             System.out.println("BB");
         }
         else if(not<=60 || not >=40){
                 System.out.println("DD");
    }else{
            System.out.println("FF kaldınız");
         }       
                               
 
     
    }          
             
             
             
}

       
    
    

