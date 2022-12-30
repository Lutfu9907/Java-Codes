/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4;

import java.util.Scanner;


/**
 *
 * @author dolay
 */
public class ornek6 {

   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kare matrisin değerini girin");
        int N;
        N=scanner.nextInt();
        
        int dizi[][]=new int[N][N];
        System.out.println("\n dizi matrisi");
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                System.out.print("A("+(i+1)+","+(j+1)+")=");
               dizi[i][j]=scanner.nextInt();
                
            }
            
        }
        
    }
    
}
