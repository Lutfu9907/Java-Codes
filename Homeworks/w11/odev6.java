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
public class odev6 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cümle gir");
        String cumle=scanner.nextLine();
        
        for (int i = 0; i <cumle.length(); i++) {
            System.out.print("->");
            for (int j = 0; j<cumle.charAt(i)-64 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
