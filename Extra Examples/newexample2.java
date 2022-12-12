
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
public class newexample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi girin");
        int n=scanner.nextInt();
        int []A=new int[n];
        
        for (int i = 0; i <A.length; i++) {
            System.out.println("sayilari gir");
            A[i]=scanner.nextInt();
            
            
        }
       int toplam=0;
        for (int i = 0; i < n; i++) {
            toplam+=A[i];
            
                    
            
        }
        int ort=0;
        ort=toplam/n;
        System.out.println("ort hesabı"+ort);
    }
    
}
