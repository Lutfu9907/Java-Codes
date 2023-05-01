/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders9;


public enum AlanKodu {
     ISPARTA ("ISP",246), ANTALYA("ANT",242), BURDUR("BRD",248);
     
     private String kısaltma;
     private int kod;
     
     AlanKodu(String kısaltma,int kod){
         this.kısaltma=kısaltma;
         this.kod=kod;
     }
     public String getKısaltma(){
         return kısaltma;
     }
     public int getKod(){
         return kod;
     }
    
}
