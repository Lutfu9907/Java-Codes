/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders6;

/**
 *
 * @author dolay
 */
public class NewMain {
     int i;
    {
        i=5;
        System.out.println(i); //dinamik kısmı
    }
    static int m;
    static
    {
       m=0;
        System.out.println(m);  //önce static sonra dinamik yazdırılır
    }
    public static void main(String[] args) {
        new NewMain(); // burada çıktı 0 5 yazdırır
        new NewMain(); //burada 0 5 5 yazdırır (yine önce static sonra dinamik kuralı)
        
    } 
    

}
