/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
/**
 *
 * @author dolay
 */
public class ComparableMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ComparableOrnegi> liste=new ArrayList<>();
        
        liste.add(new ComparableOrnegi(3));
        liste.add(new ComparableOrnegi(5));
        liste.add(new ComparableOrnegi(1));
        
        System.out.println("sıralama öncesi lsite");

        for(ComparableOrnegi a:liste){
            System.out.println(a.getDeger());
        }
        Collections.sort(liste);
        System.out.println("sıralama sonrası lsite");
        for (ComparableOrnegi a:liste) {
            System.out.println(a.getDeger());
            
        }
    }
    
}
