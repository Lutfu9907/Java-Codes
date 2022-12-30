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
public class ornek3 {

    
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("sayi gir");
    int s=scanner.nextInt();
    
        for (int a = 0; a <= s; a++) {
            for (int b = 0; b <= s; b++) {
               
                if(a*a+b*b==s){
                    System.out.print(a+"-"+b);
                    
                }else{
                    System.out.print("");
                }
                
            }
            
        }
        
    }
    
}
