
package w11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dolay
 */
public class taskagitmakas {

   
    public static void main(String[] args) {
		int kisi,pc;
		Random rnd=new Random();
		pc=rnd.nextInt(3)+1; 
		System.out.println("pc"+pc);
		System.out.println("1.taş");
		System.out.println("2.kağıt");
		System.out.println("3.makas");
		System.out.println("Lütfen seçiminizi yapınız");
		Scanner scanner=new Scanner(System.in);
		kisi=scanner.nextInt();
		if(kisi!=1 && kisi!=2 && kisi!=3)
		{
			System.out.println("yanlış bir seçim yapılmıştır.");
		}
		else 
		{ 
			if(pc==kisi)
			{
				System.out.println("berabere");
			}
			if(pc==1 &&kisi==2)
			{
				System.out.println("kişi kazandı");
			}
			if(pc==1 && kisi==3)
			{
				System.out.println("pc kazandı");
			}
			if(pc==2 && kisi==1)
			{
				System.out.println("pc kazandı");
			}			
			if(pc==2 && kisi==3)
			{
				System.out.println("kişi kazandı");
			}
			if(pc==3 && kisi==1)
			{
				System.out.println("kişi kazandı");
			}
			if(pc==3 && kisi==2)
			{
				System.out.println("pc kazandı");
			}
			
		}
	}
    }
    

