/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author dolay
 */
public class Calendar {

    int day,month,year;
    
    Calendar(){
        day=1; month=1; year=2000;
    }
    
    Calendar(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    
    void forward_bydate(){
        day++;
        if(day==31){
            month++;
            day=1;
            if(month==12){
                year++;
                month=1;
            }
        }
    }

    public static void main(String[] args) {
        Calendar tvm=new Calendar(8,4,2023);   // ilk önce constructor çalışır
        System.out.println(tvm.day+"/"+tvm.month+"/"+tvm.year);
        tvm.forward_bydate();
        System.out.println(tvm.day+"/"+tvm.month+"/"+tvm.year);
        
        Calendar tvm2=new Calendar();
        System.out.println(tvm2.day+"/"+tvm2.month+"/"+tvm2.year);
        
        for (int i = 1; i <=35; i++) {
            tvm2.forward_bydate();
            
        }
        System.out.println(tvm2.day+"/"+tvm2.month+"/"+tvm2.year);
    }
    
}
