/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolay
 */
public class Ogrenci {
    private static String isim;
    
    public void isim_ne(String ad){
        isim=ad;
    
    }
    public static void ekrana_yaz(){
        System.out.println("merhabalar "+isim);
    }
    
}
