/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders4;

/**
 *
 * @author dolay
 */
public class örnek {

    static int topla(int... sayilar){
        int tpl =0;
        for (int sayi:sayilar) {
            
            tpl+=sayi;
            
        }
        return tpl;
    }
    
    
    public static void main(String[] args) {
        System.out.println(topla(3,5));
        System.out.println(topla());
        System.out.println(topla(3,5,7,9,45,63,78));
    }
    
}
