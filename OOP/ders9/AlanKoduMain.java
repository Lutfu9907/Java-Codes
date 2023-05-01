/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders9;

/**
 *
 * @author dolay
 */
public class AlanKoduMain {

    
    public static void main(String[] args) {
        AlanKodu aln=AlanKodu.ISPARTA;
        System.out.println(aln.getKısaltma());
        System.out.println(aln.getKod());
        System.out.println(aln.name());
        System.out.println(aln.ordinal());
        
        for (AlanKodu a:AlanKodu.values()){
            System.out.println(a.getKod());
        }
    }
    
}
