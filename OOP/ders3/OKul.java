/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders3;

/**
 *
 * @author dolay
 */
public class OKul {

    
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci();
        ogrenci1.isim="melike";
        ogrenci1.ogrenciNO=333;
        
        ders3_2 ders1=new ders3_2();
        ders1.dersId=1234;
        ders1.dersAdı="nesneye dayalı programlama";
        
        Bölüm blm1=new Bölüm();
        blm1.bölümİsmi="Yazılım Mühendisliği";
        
        ders1.dBölüm=blm1;
        blm1.bDersler=new ders3_2[10];
        blm1.bDersler[0]=ders1;
        
        ogrenci1.oBölüm=blm1;
        blm1.bOgrenciler=new Ogrenci[30];
        blm1.bOgrenciler[0]=ogrenci1;
        
        ogrenci1.dersler=new ders3_2[7];
        ogrenci1.dersler[0]=ders1;
        
        ders1.ogrenciler=new Ogrenci[100];
        ders1.ogrenciler[0]=ogrenci1;
                
        
        System.out.println("melikenin aldığı ders"+ogrenci1.dersler[0].dersAdı);
        System.out.println("bölümün ilk dersi"+blm1.bDersler[0].dersAdı);
        
       
    }
    
}
