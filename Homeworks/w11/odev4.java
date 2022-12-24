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
public class odev4 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cümle gir");
        String cumle=scanner.nextLine();
        String k1="";
        String k2="";
        char dizi[]={'a','e','i','ı','ö','o','u','ü'};
        
        boolean durum;
        for (int i = 0; i < cumle.length(); i++) {
            durum=false;
            for (int j = 0; j < dizi.length; j++) {
                if (cumle.charAt(i) == dizi[j]) {
                    durum = true;
                    break;
                }            
            }
            if (durum) {
                    k1 += cumle.charAt(i);
                } else {
                    k2 +=cumle.charAt(i);
                }
        }      
        System.out.println(k1 + "\n" + k2);
    }
      
}

