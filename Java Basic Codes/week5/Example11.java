/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emrah
 */
public class Example11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char x1 = 120; // 88 X 120 x
        char x2 = 'x';
        
        if(Character.compare(x1, x2)>0) {
            System.out.println("Evet aynı");
        }
        else {
            System.out.println("Farklı");
        }
       
    }
    
}
