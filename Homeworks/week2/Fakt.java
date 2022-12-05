/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fakt;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Fakt {

    public static void main(String[] args) {
        Scanner okul =new Scanner(System.in);
        int a;
       int çarpim=1;
        System.out.println("sayı gir");
        a=okul.nextInt();
        
        for (int i = 1; i <=a; i++) {
            
           çarpim = çarpim*i;
            
        }
        System.out.println(çarpim);
    }
}
