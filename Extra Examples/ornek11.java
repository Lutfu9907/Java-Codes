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
public class ornek11 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("n sayisini giriniz");
        int n=scanner.nextInt();
        
        int t1=0;
        int t2=0;
        int t3=0;
        for (int i = 1; i <= n; i++) {
            t1=+i;
            
        }
        for (int i = 1; i <= n; i+=2) {
            t2=+i;
            
        }
        for (int i =2; i <= n; i+=2) {
            t3=+i;
            
        }
        System.out.print("\n"+n+","+t1);
        System.out.print("\n"+n+","+t2);
        System.out.print("\n"+n+","+t3);
    }
    
}
