/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders11;

/**
 *
 * @author dolay
 */
public class Samsung extends Telefon {
    
    public Samsung(String model,int fiyat){
        super("Samsung",model,fiyat);
    }
    @Override
    public void aramaYap (String numara){
        System.out.println(getMarka()+"marka1"+getModel()+"model"+ numara+"aranıyor");
        
    }
    @Override
    public void mesaj(String numara,String m){
        System.out.println(numara+"numaralı telefona"+m+"mesaj atıldı");
        
    }
    public void ozelliklerGoster(){
        System.out.println(model+fiyat);
    }
    
}
