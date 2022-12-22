
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
public class example8 {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi gir");
        int n=scanner.nextInt();
        
        
        for (int i = 1; i <= n; i++) {
            if(i%2==1){
                for (int j = 1; j < n; j++) {
                    System.out.print("* ");
                    
                }
            }
            else{
                for (int j = 1; j < n-1; j++) {
                    System.out.print(" *");
                    
                }
            }
             System.out.println();
        }
              
        }
        
    }
    

