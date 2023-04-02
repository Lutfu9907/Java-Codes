/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolay
 */
public class evMain{

    
    public static void main(String[] args) {
        Ev yazlikEv=new Ev();
        yazlikEv.kapiNo=789;
        yazlikEv.sokakAdi="Böcek";
        yazlikEv.yaz();
        
        Ev kislikEv=new Ev();
        kislikEv.kapiNo=456;
        kislikEv.sokakAdi="Bitki";
        
        yazlikEv.yaz();
        System.out.println("------");
        kislikEv.yaz();
        
        System.out.println("XXXXXXX");
        Ev tmp;
        tmp=yazlikEv;
        yazlikEv.sokakAdi="Kedi";
        tmp.yaz();
    }
    
}
