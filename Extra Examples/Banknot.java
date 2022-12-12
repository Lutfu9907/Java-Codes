/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class Banknot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("fiyat değerini giriniz");
        int fiyat=scanner.nextInt();
        int para,banknott,miktar,adet,kalanpara;
        
        do{
            System.out.println("para değerini giriniz");
             para = scanner.nextInt();
             
            
        }while(para<fiyat);
                
                int[]banknot={200,100,50,20,10,5,1};
                miktar=para-fiyat;
                
                for (int i = 0; i < banknot.length; i++) {
                    adet=miktar/banknot[i];
                    kalanpara=miktar-(banknot[i]*adet);
                    miktar=kalanpara;
                    
                    if(adet>0){
                        System.out.println(adet+"adet"+banknot[i]+"TL");
                        
                    }
        }
        System.out.println("para üstü");
    }
    
}
