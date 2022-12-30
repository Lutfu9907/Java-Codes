/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class ornek2 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float a, b,c,x;
        System.out.println("ax+b=c");
        System.out.println("a değerini girin");
        a=scanner.nextFloat();
        
        System.out.println("b değerini girin");
        b=scanner.nextFloat();
        
        System.out.println("c değerini girin");
        c=scanner.nextFloat();
        
        
       
        x = (c-b)/a;
        System.out.println(x);
    }
    
}

        
        