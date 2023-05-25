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
public class NewMain {

    /**
     Burada upcasting ve downcasting işlemini inceledik
     * @param args
     */
    public static void main(String[] args) {
        Hayvan h1=new Köpek();
       // Kedi k1=(Kedi)h1;  //cast işlemi 
        /*Besle b1=new Besle();
        b1.besle(h1);
        Hayvan h2=new Köpek();
        b1.besle(h2);*/
      //k1.sesÇıkar();
      //Köpek k2=new Köpek();
      //k2.sesÇıkar();  
        
      
      
       if(h1 instanceof Kedi){
            Kedi k1=(Kedi)h1;
            k1.sesÇıkar();
            System.out.println(k1.beslen());
        }
        else if(h1 instanceof Köpek){
            Köpek k1=(Köpek)h1;
            k1.sesÇıkar();
            System.out.println(k1.beslen());
        }
    }
    
}
