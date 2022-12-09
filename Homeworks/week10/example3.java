/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sınıf mevcudu nedir");
        int N=input.nextInt();
        int []notlar =new int[N];
        
        for (int i = 0; i <N; i++) {
            System.out.println((i+1)+"notları girin");
            notlar[i]=input.nextInt();
        }
        int ort=0;
        int toplam=0;
        for (int i = 0; i < N; i++) {
        toplam+=notlar[i];
        
        } 
        ort=toplam/N;
        int gecen=0;
        for (int i = 0; i <N; i++) {
            if(notlar[i]>=ort){
                gecen++;
                System.out.println((i+1)+"geçti");
            }
            else
                System.out.println("kaldı");
                
        }
        int kalan=N-gecen;
        System.out.println("geçen öğrenci"+gecen+"kalan öğrenci");
        
    }
    
}
