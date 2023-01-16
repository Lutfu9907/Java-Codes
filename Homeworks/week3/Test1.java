/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test1;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("notunuzu girin");
        int not =scanner.nextInt();
        
    if(not>=90){
        System.out.println("AA");
    }
        
    
     if(not>=80){
          System.out.println("BB");
    }
     if(not>=60){
          System.out.println("DD");
    }
    else{
            System.out.println("kaldınız");
          
    }
    

  }
 

}
