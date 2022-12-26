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
public class odev1 {

    public static void main(String[] args) {
     Scanner scanner =new Scanner(System.in);
     System.out.println("cümle giriniz");
     String cumle=scanner.nextLine();
     
        for (int i = 0; i < cumle.length(); i++) {
            if((cumle.charAt(i)>=65) && (cumle.charAt(i)<=90)){
                
                System.out.print((char)(cumle.charAt(i) + 32));
            }
            else{
                System.out.print((char)(cumle.charAt(i) - 32));
            }
        }
    }
    
}
