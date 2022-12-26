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
public class odev5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cümle girin");
        String cumle=scanner.nextLine();
        int n=cumle.length()/2;
        
        for (int i = 0; i <cumle.length()/2; i++) {
            System.out.print(cumle.charAt(i+n));
            System.out.print(cumle.charAt(n-1-i));
        }
        
        }
    }
    

