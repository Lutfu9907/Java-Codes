
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
public class newexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Sayı değeri girin");
        int n=scan.nextInt();
        int[]A=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("değerleri gir");
            A[i]=scan.nextInt();
            
        }
        for (int i = 1; i < n; i++) {
          if(A[i]%i!=0){
              System.out.println(i+"sayi asal");
          }
          else{
              System.out.println("sayi asal değil");
          }
        }
    }
    
}
