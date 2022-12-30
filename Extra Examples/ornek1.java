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
public class ornek1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int e,f,aci,alan;
        int pi=3;
        System.out.println("birinci köşegen girin");
        e=scanner.nextInt();
        
        System.out.println("2.köşengen girin");
        f=scanner.nextInt();
        
        System.out.println("acıyı giriniz");
        aci=scanner.nextInt();
        
        
        alan=e*f*(aci*pi/180)/2;
        System.out.println(alan);
     
    }

}
