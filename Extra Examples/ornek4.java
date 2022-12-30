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
public class ornek4 {

     
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("sayi gir");
        String dizi[]={"sıfır","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
        int x;
        x=scanner.nextInt();
        if(x<=0){
            System.out.println("eksi");
        }else{
            System.out.println("");
        }
        System.out.println(dizi[Math.abs(x)]);
    }
    
}
