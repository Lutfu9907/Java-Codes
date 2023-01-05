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
public class odev3 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nxn");
        int n=scanner.nextInt();
        int dizi[][]=new int[n][n];
        int dizi2[][]=new int[n][n];
        
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                dizi[i][j]=scanner.nextInt();
                if(i>j){
                    dizi2[i][j]=0;
                    System.out.println((i+1)+","+(j+1)+"=");
                }else{
                    dizi2[i][j]=dizi[i][j];
                    System.out.println("üst üçgen");
                }
                
            }   
                
          }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                System.out.println(dizi2[i][j]);
                System.out.println();
            }
        }
        }
    }
    

