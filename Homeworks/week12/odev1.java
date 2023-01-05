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
public class odev1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nxn değerini giriniz");
        int n=scanner.nextInt();
        int dizi[][]=new int[n][n];
        int toplam=0;
        for (int i = 1; i <dizi.length; i++) {
            for (int j = 1; j <dizi.length; j++) {
                dizi[i][j]=scanner.nextInt();
                
            }
        }
        for (int i = 1; i < dizi.length; i++) {
            for (int j = 1; j < dizi.length; j++) {
                if((i+j)<(n+1)){
                    toplam=toplam+dizi[i][j];
                }else{
                    System.out.println(" ");
                }
                
            }
        }
        System.out.print(toplam);
        
    }
}
