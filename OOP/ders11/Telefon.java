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
public abstract class Telefon implements ITelefon{
    protected String marka;
    protected String model;
    protected int fiyat;
    
    public Telefon (String marka, String model,int fiyat){
        this.marka=marka;
        this.model=model;
        this.fiyat=fiyat;
        
    }
    public abstract void ozelliklerGoster();
    public abstract void aramaYap(String numara);
    public abstract void mesaj(String numara,String m);

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getFiyat() {
        return fiyat;
    }
   
    
}
    

