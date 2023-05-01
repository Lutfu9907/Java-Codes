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
public class PublicPrivateProtected {
    public int x=3;
    int y=5;
    protected int z=7;
    private int k=10;
    
    public void puMetod(){
        System.out.println(k);
        piMetod();
    }
    private void piMetod(){
        System.out.println("Private dasın");
    }
    void deMetod(){
        System.out.println("default dasın");
        piMetod();
    }
    protected void poMetod(){
        System.out.println("protected dasın");
    }
}
