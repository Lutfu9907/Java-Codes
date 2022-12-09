/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author dolay
 */
public class Kart {


        private char deger;
        private boolean tahmin=false;

        public Kart(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
        
        
        
    }
    

