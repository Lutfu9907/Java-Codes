/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class array {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Random r =new Random();
        
        do
        {
            System.out.println(" N gir");
            N=input.nextInt();
        }
            
            while(0>N);
            
            int[] randomsayi = new int[N];
            
            for (int i = 0; i < randomsayi.length; i++) {
                randomsayi[i]=r.nextInt(100);
            }    
            
              for (int i = 0; i < randomsayi.length; i++) {
                  System.out.println((i+1)+randomsayi[i]+"inci sayi:");
              }
              
              int maxsayi=randomsayi[0];
              int minidex=0;
              int maxindex=0;  
              for (int i = 1; i < randomsayi.length; i++) {
                  if(randomsayi[i]>maxsayi){
                     maxsayi=randomsayi[i];
                     maxindex=i;
             
                  }
              }
            System.out.println("max eleman"+maxsayi);
            System.out.println("max elelamn indexi"+maxindex);
        }
            
    }
  
            
            
        

    
    

