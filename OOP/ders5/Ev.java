/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders5;

/**
 *
 * @author dolay
 */
public class Ev {
    int kapiNo;
    String sokakAdi;
    
    Ev(int kapiNo, String sokakAdi){
        
        this.kapiNo=kapiNo;
        this.sokakAdi=sokakAdi;
        System.out.println(kapiNo+" "+sokakAdi);
    }
    Ev(){
        
        this(456,"yaz");
    }
    Ev(int kapiNo){
        this(kapiNo,"kış");
        
    }
    Ev(String sokakAdi){
        this(456,sokakAdi);
    }
}
