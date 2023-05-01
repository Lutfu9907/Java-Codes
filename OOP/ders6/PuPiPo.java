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
public class PuPiPo {

    
    public static void main(String[] args) {
        PublicPrivateProtected d1=new PublicPrivateProtected();
        d1.puMetod();
        //d1.k=15; HATA verir!!
        //d1.piMetod(); HATA verir!!
        //d1.x=8;
        //d1.y=9;
        System.out.println(d1.z);
        d1.deMetod();
        d1.poMetod();
    }
    
}
