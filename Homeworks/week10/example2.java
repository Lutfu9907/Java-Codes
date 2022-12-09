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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 0;
       
        do
        {
            System.out.println(" N gir");
            N=input.nextInt();
        }
            
            while(0>N);
            
            int[]a= new int[N];
            
            for (int i = 0; i < a.length; i++) {
                System.out.println((i+1)+"inci sayi:");
                a[i]=input.nextInt();
                
                
    }
        for (int i = 0; i <a.length/2; i++) {
            int tmp=a[i];
            a[i]=a[N-1-i];
            a[N-1-i]=tmp;
            
        }
            
        }
}
