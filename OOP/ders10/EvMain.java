/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders10;

/**
 *
 * @author dolay
 */
public class EvMain {

    public static void main(String[] args) {
       KiralıkEv k1=new KiralıkEv(120);
        System.out.println(k1.getFiyat());
        
        SatılıkEv s1=new SatılıkEv(120);
        System.out.println(s1.getFiyat());
    }
    
}
