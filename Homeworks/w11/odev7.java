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
public class odev7 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cümle gir");
        String cumle=scanner.nextLine();
        int n=cumle.length();
        
        for (int i = n/2; i >0; i--) {
            System.out.print(cumle.charAt(i-1));
        } 
        for (int i = 1; i < (n/2+1); i++) {
                 
            System.out.print(cumle.charAt(n-i));
        }
        
    }
    
}
