
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
public class newexample6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı gir");
        int n=scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= n; j++) {
                if(i<=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println(" ");
        }
    }
    
}
