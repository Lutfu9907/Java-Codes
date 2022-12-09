/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class example4fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("değer gir");
        int N=input.nextInt();
        int fibo[]=new int [N];
        fibo[0]=0;
        fibo[1]=1;
        
        
        for (int i = 2; i < N; i++) {
            int yeni=fibo[i-1]+fibo[i-2];
            fibo[i]=yeni;
            
        }
         for (int i = 0; i < N; i++) {
            if(i==fibo.length-1){
                System.out.println(fibo[i]);
            } 
        else
         System.out.println(fibo[i]+",");
    }
    }
}
