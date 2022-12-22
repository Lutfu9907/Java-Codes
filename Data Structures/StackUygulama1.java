package stackUygulama;

import java.util.Stack;

/**
 *
 * @author sariz
 */
public class StackUygulama1 {
    
    public void uygulama(){
        Stack<Double> s1=new Stack();
       double temp1,temp2;
        for (double i = 0; i < 100; i++) {
            if(i<2){
                s1.push(i);
            }
            else{
               temp1=s1.pop();
               temp2=s1.pop();
               s1.push(temp2);
               s1.push(temp1);
               s1.push(temp1+temp2);
            }
            System.out.println(s1.peek());
        }
    }
    
}
