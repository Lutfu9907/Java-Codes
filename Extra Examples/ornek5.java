/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4;

import java.util.*;

/**
 *
 * @author dolay
 */
public class ornek5 {
     
    
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int n=scanner.nextInt();
      int a[]=new int [n];
        for (int i = 0; i < n; i++) {
             a[i]=scanner.nextInt();
             
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if(a[j+1]<a[j]){
                    int g = a[j];
                    a[j]=a[j+1];
                    a[j+1]=g;
                
            }
            
        }
        }
    
    
    }
    
}
