/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders3;

/**
 *
 * @author dolay
 */
public class Canlılar {
    static class İnsanlar
    {
    
        static class Kadınlar{
            public String konuşma="sakin";
        }
        static class Erkekler{
            public String konuşma="akıcı";
        }
    }
    
    static class Hayvanlar
    {
        static class Köpekler{
            public String konulma="havlar";
        }
        static class Kediler{
            public String konuşma="miyavlar";
        }
    }
    
    public static void main(String[] args) {
    
        Canlılar.İnsanlar.Kadınlar k1=new Canlılar.İnsanlar.Kadınlar();
        System.out.println(k1.konuşma);
        
        Canlılar.Hayvanlar.Kediler k2=new Canlılar.Hayvanlar.Kediler();
        System.out.println(k2.konuşma);
       
    
        
        
    }
    
}
