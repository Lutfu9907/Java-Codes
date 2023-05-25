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
public class NewMain {

    public static void main(String[] args) {
        
        IterableOrnegi ornek =new IterableOrnegi();
        for(String element:ornek){
            System.out.println(element);
        }
    }
    
}
