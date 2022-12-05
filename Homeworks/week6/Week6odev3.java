/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week6odev3;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week6odev3 {
 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Pozitif Tam Sayı Giriniz: ");
            n = input.nextInt();
        } while (n <= 0);

        int toplam = 0, sayac = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                toplam = toplam + i;
                sayac++;
            }
        }
        float ondalikli = (float) toplam / sayac;
        int tamSayi = toplam / sayac;

        if (ondalikli == tamSayi) {
            System.out.println(+n + " Aritmetik Sayıdır");
        } else {
            System.out.println(+n + " Error");
        }

    }
}
