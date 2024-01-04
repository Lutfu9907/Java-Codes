
package AlgoritmaOdev;

import java.util.Scanner;

public class NotHesapla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Kullanıcıdan ders adını alma
        System.out.print("Dersin adını giriniz: ");
        String dersAdi = scanner.nextLine();
        
        // Kullanıcıdan değerlendirme kriteri sayısını alma
        System.out.print("Derse ait kaç adet değerlendirme kriteri var: ");
        int kriterSayisi = scanner.nextInt();
        
        // Değerlendirme kriterlerini tutacak dizileri oluşturma
        String[] kriterAdlari = new String[kriterSayisi];
        int[] kriterEtkileri = new int[kriterSayisi];
       
        // Kullanıcıdan değerlendirme kriteri adlarını ve etkilerini alma
        for (int i = 0; i < kriterSayisi; i++) {
            System.out.print((i + 1) + ". Kriterin adı nedir: ");
            scanner.nextLine(); 
            kriterAdlari[i] = scanner.nextLine();
            System.out.print((i + 1) + ". Kriterin etkisi: ");
            kriterEtkileri[i] = scanner.nextInt();
        }

       // Kullanıcıdan öğrenci sayısını alma
        System.out.print("Kaç öğrenci notu gireceksiniz: ");
        int ogrenciSayisi = scanner.nextInt();
        
        // Öğrenci bilgilerini tutacak dizileri oluşturma
        String[] adSoyad = new String[ogrenciSayisi];
        int[] vizeNotu = new int[ogrenciSayisi];
        int[] finalNotu = new int[ogrenciSayisi];
        int[] odevNotu = new int[ogrenciSayisi];
        
        // Kullanıcıdan her öğrencinin bilgilerini alma
        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.print((i + 1) + ". Öğrencinin adı soyadı: ");
            scanner.nextLine();
            adSoyad[i] = scanner.nextLine();
            System.out.print((i + 1) + ". Öğrencinin vize notu: ");
            vizeNotu[i] = scanner.nextInt();
            System.out.print((i + 1) + ". Öğrencinin final notu: ");
            finalNotu[i] = scanner.nextInt();
            System.out.print((i + 1) + ". Öğrencinin ödev notu: ");
            odevNotu[i] = scanner.nextInt();
        }

       // Sonuçları ekrana yazdırma
        System.out.println("\nAdı\tSoyadı\tVize\tFinal\tÖdev\tOrtalama");
        for (int i = 0; i < ogrenciSayisi; i++) {
            double ortalama = hesaplaOrtalama(vizeNotu[i], finalNotu[i], odevNotu[i], kriterEtkileri);
            System.out.printf("%s\t%s\t%d\t%d\t%d\t%.2f%n", dersAdi, adSoyad[i], vizeNotu[i], finalNotu[i], odevNotu[i], ortalama);
        }
    }
    // Öğrenci ortalamasını hesaplayan fonksiyon
    public static double hesaplaOrtalama(int vize, int finall, int odev, int[] kriterEtkileri) {
        int toplamPuan = vize * kriterEtkileri[0] + finall * kriterEtkileri[1] + odev * kriterEtkileri[2];
        int toplamEtki = kriterEtkileri[0] + kriterEtkileri[1] + kriterEtkileri[2];
        return (double) toplamPuan / toplamEtki;
    }
}

