/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emrah
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c, d;
        c = ++b; // önce b 1 artar ve 3 olur; sonra c'ye 3 atanır
        d = a++; // önce a'yı d ye atar ve d 1 olur; sonra a 1 artar ve 2 olur
        c++; // c 1 artar ve 4 olur
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
