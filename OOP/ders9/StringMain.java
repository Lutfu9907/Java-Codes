/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders9;

/**
 *
 * @author dolay
 */
public class StringMain {

    
    public static void main(String[] args) {
        String s1=new String ("Melike");
        String s2=new String ("Melike");
        System.out.println(s1==s2);
        
        String s3="melike";
        String s4="melike";
        System.out.println(s3==s4);
        
        String s5="merhaba dünya";
        s5=s5.replaceAll("merhaba", "selam");
        System.out.println(s5);
    }
    
}
