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
public class ornek12 {

    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("a değerini giriniz");
        int a=scanner.nextInt();
        int k=a;
        int s=0;
        if(k>0){
            System.out.println(k%10+".10^"+s+"+");
            k=(k/10);
            s=s+1;
        }
        else{
            System.out.println("");
        }
    }
    
}
