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
public class odev3 {

    
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("cümle gir");
       String cumle=scanner.nextLine();
       char h,y;
       
        System.out.println("\n değiştirilecek harfi girin");
        h=scanner.nextLine().charAt(0);
        System.out.println("harfin yeni değeri");
        y=scanner.nextLine().charAt(0);
        System.out.println("\n yeni cümle"+cumle.replace(h, y));        
       
    }
    
}
