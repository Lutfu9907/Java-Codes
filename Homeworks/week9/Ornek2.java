
package week9;

import java.util.Scanner;

public class Ornek2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("N Değeri: ");
        int n = scanner.nextInt();
        double toplam = 0;
        for (int i = 0; i <= n; i++) {
             toplam += (double) (Math.pow(-1, i)/(2*i+1));
        }
        System.out.println("Sonuç: "+(4*toplam));
    }

}
