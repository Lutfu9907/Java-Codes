/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders12;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dolay
 */
public class ComparableOrnegi implements Comparable<ComparableOrnegi> {
    
    private int deger;
   
    public ComparableOrnegi(int deger){
        this.deger=deger;
    }
    public int getDeger(){
        return deger;
    }

    @Override
    public int compareTo(ComparableOrnegi diger) {
      
        return Integer.compare(this.deger,diger.getDeger());
    }
    
    
}
