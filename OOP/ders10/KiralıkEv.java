/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders10;

/**
 *
 * @author dolay
 */
public class KiralıkEv extends Ev{
    public KiralıkEv(int metrekare){
        super.metrekare=metrekare;
    }
    
    @Override
    public double getFiyat(){
        return metrekare*50;
    }
}
