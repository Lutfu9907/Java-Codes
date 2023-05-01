
import java.util.Scanner;
public class ders1 {

    
    public static void main(String[] args) {
    
        Scanner scanner=new Scanner(System.in);
        System.out.println("N değeri giriniz");
        int N=scanner.nextInt();
        int temp;
        int A[]=new int[N];
        
        for (int i = 0; i < N; i++) {
          
            System.out.println("please" +i+ "give to your number");
            
            A[i]=scanner.nextInt();
                  
      
        }
        
        for (int i = 0; i < N-1; i++) {
            for (int j = 1+i; j < N; j++) {
                if(A[j]<A[i]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
            
        }
        yazdir(A);
        
        
    }
    
    public static void yazdir(int[]Dizi){
        
        for (int i = 0; i <Dizi.length; i++) {
            System.out.println(Dizi[i]+" ");
            
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}
