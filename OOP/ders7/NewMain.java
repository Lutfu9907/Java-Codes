/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders7;

/**
 *
 * @author dolay
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MotorluAraba ma1=new MotorluAraba();
        ma1.setKapıSayısı(2);
        System.out.println("kapı sayısı"+ma1.getKapıSayısı());
        System.out.println("tekerlek sayısı"+ma1.getTekerlekSyaısı());
    }
    
}
