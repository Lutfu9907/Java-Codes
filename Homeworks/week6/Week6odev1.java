/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week6odev1;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week6odev1 {

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print(" Pozitif Tam Sayi Giriniz: ");
            n = scanner.nextInt();
        } while (n <= 0);

        boolean asalmi;
        for (int i = 2; i <= n; i++) {
            asalmi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalmi = false;

                }
            }
            if (asalmi == true && n % i == 0) {
                System.out.println(i);
            }
        }

    }
    }

