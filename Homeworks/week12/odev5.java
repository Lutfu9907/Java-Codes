/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class odev5 {

   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nxn değeri girin");
        int n=scanner.nextInt();
        int dizi[][]=new int [n][n];
        int dizi2[]=new int[n];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                dizi[i][j]=scanner.nextInt();
                System.out.println(i+j);
            }
        }
        for (int i = 0; i < dizi.length; i++) {
             dizi2[i]=0;
             for (int j = 0; j < dizi.length; j++) {
                 dizi2[i]=dizi2[i]+dizi[i][j];
                
            }
                System.out.println(dizi2[i]);
            
        }
        
    }
    
}
