/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emrah
 */
public class AVPII {
    float ogrencino;
    String adsoyad;
    float vize, finall, ortalama;
    char harfnot;
    
    // class adı aynı adı taşıyan ve herhangi bir tip içermeyen metotlar (constructor-yapılandırıcı)
    AVPII(float no, String ad, float vizenot, float finalnot) {
        ogrencino = no;
        adsoyad = ad;
        vize = vizenot;
        finall = finalnot;
    }
    
    void ortalamahesapla(){
        ortalama = vize*40/100 + finall*60/100;
    }
    
    void harfnothesap() {
        if(ortalama<50){
            harfnot='F';
        }
        else if (ortalama>50 && ortalama>70) {
            harfnot='C';
        }
        else{
            harfnot='A';
        }
        
    }
}
