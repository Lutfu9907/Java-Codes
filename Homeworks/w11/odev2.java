/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w11;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class odev2 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cumle=scanner.nextLine();
        int r = 0,s = 0;
        for (int i = 0; i < cumle.length(); i++) {
            r=s%4;
            s=s+1;
            if(r<2){
                System.out.print(cumle.toUpperCase().charAt(i));
            }
            else{
                System.out.print(cumle.toLowerCase().charAt(i));    
            }
        }
        
        
    }
    
}
