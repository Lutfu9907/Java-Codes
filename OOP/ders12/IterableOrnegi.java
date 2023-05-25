/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders12;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dolay
 */
public class IterableOrnegi implements Iterable<String>{
    
    private ArrayList<String> liste;
   
    public IterableOrnegi(){
        liste=new ArrayList();
        liste.add("yazılım");
        liste.add("bilgisayar");
        liste.add("bilişim");
    }

    @Override
    public Iterator<String> iterator() {
        return liste.iterator();
    }
    
}
