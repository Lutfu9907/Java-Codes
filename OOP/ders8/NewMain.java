/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders8;

/**
 *
 * @author dolay
 */
public class NewMain {

    
    public static void main(String[] args) {
        
   //     System.out.println(Ata.a);
   //     System.out.println(Yavru.b); // Her zaman önce Ata'ya bakılır.
   //     System.out.println(Torun.c);
   //     new Ata();
   //     new Yavru();
   //     new Torun();
   //    System.out.println(Ata.a);
   //    System.out.println(Yavru.a);
   //    System.out.println(Torun.a);
    }
    
}
class Ata{
    static{
        System.out.println("ata sınıf initalize ediliyor");
    }
    
    {
        System.out.println("ata sınftan nesne türetildi");
    }
    static int a=3;
    private static A a1=new A();
    private B b1=new B();
    
    Ata(){
        System.out.println("ata sınftayız");
        
    }
        public static final C c1=new C();

}
class Yavru extends Ata{
    static{
        System.out.println("yavru sınıf initalize ediliyor");
    }
    {
        System.out.println("yavru sınıf nesne türetildi");
    }
    
    static int b=5;
    private static D d1=new D();
    private E e1=new E();
    
    Yavru(){
        
        System.out.println("yavru sınıftayız");
        
    }
}

class Torun extends Yavru{
    static{
        System.out.println("torun sınıfı initalize ediliyor");
    }
    {
        System.out.println("torun sınıftn nesne türetildi");   
    }
    static int c=7;
    private static E e2=new E();
    
    Torun (){
        System.out.println("torun sınfıtayız");
    }
}

class A {
    B b2=new B();
    
    A(){
        System.out.println("A sınıftayız");
   
    }
}

class D{
    D(){
        System.out.println("D sınftayız");
    }
}

class E{
    B b2=new B();

    E(){
        System.out.println("E sınıftayız");
    }
}

class B{
    static{
        System.out.println("B sınıfının static bloğu");
    }
    B(){
        System.out.println("B sınftayız");
    }
}

class C{
    static{
        System.out.println("C sınıfının static bloğu");
    }
    C(){
        System.out.println("C sınıftayız");
    }
}
    

    
