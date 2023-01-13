
package week9;

import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n Sayısını Giriniz: ");
        int n = scanner.nextInt();
        double toplam = 0;
       
        for (int i = 0; i <= n; i++) {
            int temp=2*i+1;
            int fakt=1;
            for (int j = 1; j <= temp; j++) {
                fakt*=j;
            }
            toplam+=(double)(temp+1)/fakt;
        }
       
        System.out.println("Sonuç: " + toplam);
    }
}
