
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dolay
 */
public class newexample4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int n;
       int toplam=0;
       do{
           
           System.out.println("n değeri girin");    
           n =scanner.nextInt();
           
           if(n%2==1){
               toplam+=n;
               
           }
     
       }while(n>0);
        System.out.println("toplam"+toplam);
    }
    
}
