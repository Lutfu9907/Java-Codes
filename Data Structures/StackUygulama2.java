package stackUygulama;

import java.util.Stack;

/**
 *
 * @author sariz
 */
public class StackUygulama2 {
    
    public void uygulama(){
        Stack<Character> s1= new Stack<>();
        int kntrl=0;
        String metin="3+(5+2)*6+(9*(7+9))";
        for (int i = 0; i < metin.length(); i++) {
            char a = metin.charAt(i);
            if(a=='('){
                s1.push(a);
            }
            else if(a==')'){
                if(s1.empty()==true) kntrl=1;
                else s1.pop();
            }
        }
        if(kntrl==0 & s1.empty()==true) System.out.println("Girilen ifade dogru");
        else System.out.println("Girilen ifade yanlis");

    }
    
}
