/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week8maclaurin;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week8Maclaurin {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
    System.out.println("x açısını giriniz");
    int x = input.nextInt();
     System.out.println("açılma oranını giriniz");
    int n = input.nextInt();
    int a=1;
    double toplam=1;
    double fak=1;
    int genelx=1;
    
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                for (int j = 1; j <= i; j++) {
                    fak*=j;
                    genelx*=genelx;
                }
                if (a==1) {
                    toplam=toplam-(genelx/fak);
                    a=2;
                } 
                 else {
                    toplam=toplam+(genelx/fak);
                    a=1;
                } 
            }
        }
        System.out.println("cos(x) Maclaurin sonucu= "+toplam);
   
    }
}
