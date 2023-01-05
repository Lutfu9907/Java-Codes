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
public class odev7 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nxn matrisi gir");
        int n=scanner.nextInt();
        int dizi1[][]=new int[n][n];
        int dizi2[][][]=new int[n][n][n];
        int input;
        
        for (int i = 1; i < dizi1.length; i++) {
            for (int j = 1; j < dizi1.length; j++) {
                dizi1[i][j]=scanner.nextInt();
            }
        }
        for (int i = 1; i < dizi1.length; i++) {
            for (int j = 1; j < dizi1.length; j++) {
                dizi2[i][i][j]=dizi1[i][j];
            }
        }
        for (int i = 1; i < dizi1.length; i++) {
            for (int j = 1; j < dizi1.length-1; j++) {
                for (int k = 1; k < dizi1.length; k++) {
                    if(dizi2[i][i][k]<dizi2[i][i][j]){
                        input = dizi2[i][i][j];
                        dizi2[i][i][j]=dizi2[i][i][k];
                        dizi2[i][i][k]=input;
                    }else{
                        System.out.println("");
                    }
                }
            }
        }
        for (int i = 1; i < dizi1.length; i++) {
            for (int j = 1; j < dizi1.length; j++) {
                System.out.print(dizi2[i][i][j]+"<");
            }
            
        }
    }
    
}
