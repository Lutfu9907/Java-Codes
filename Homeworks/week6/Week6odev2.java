/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week6odev2;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Week6odev2 {

      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen Pozitif Bir Tam Sayý Giriniz: ");
            n = input.nextInt();
        } while (n <= 0);

        boolean asalMi = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                asalMi = false;

            }

        }
        int a = n + 2;
        boolean chenAsaliMi = true; //varsayým/asal olursa
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                chenAsaliMi = false;

            }
        }
        if (asalMi == true && n != 1 && chenAsaliMi == true) {
            System.out.println(+n + " Chen Asalýdýr");
        } else {
            System.out.println(+n + " Chen Asalý Deðildir");
        }

    }

    }

