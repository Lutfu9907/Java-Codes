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
public class ornek7 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("boyutu giriniz");
        int N ;
        int dizi[][]=new int[100][100];
        N=scanner.nextInt();
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                System.out.print(+i+"   "+j);   
            }
            
        }
    }
    
}
