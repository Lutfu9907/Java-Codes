/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4;

import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class ornek8 {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("matris boyutunu gir");
        int n=scanner.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i+1)+","+(j+1));
                a[i][j]=scanner.nextInt();
                if(i>j){
                    b[i][j]=0;
                }else{
                    b[i][j]=a[i][j];
                }
                
            }}
        System.out.println("üst matris");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j]);
                
            }
        }
 
            }
        }
    
    


      