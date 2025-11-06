/*
 * Ad Soyad: Cansude Sayın
 * Ogrenci No: 250541096
 * Tarih: 06/11/2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
         Scanner input = new Scanner(System.in);
        
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        String ad, soyad;
        int ogrenciNo, yas;
        double gpa;
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        System.out.print("Adinizi girin: ");
        ad = input.next();
        
        // Soyad
        System.out.print("Soyadinizi girin: ");
        soyad = input.next();
        
        // Ogrenci No
        System.out.print("Ogrenci numaraniz: ");
        ogrenciNo = input.nextInt();

        
        // Yas
        System.out.print("Yasiniz: ");
        yas = input.nextInt();
        
        // GPA
        System.out.print("GPA (0.00-4.00): ");
        gpa = input.nextDouble();
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci No: " + ogrenciNo);
        System.out.println("Yas: " + yas);
        System.out.printf("GPA: %.2f\n", gpa);
        // COZUMUNUZU BURAYA YAZIN
       
        if (gpa >= 2.0) {
            System.out.println("Durum: Basarili Ogrenci");
        } else {
            System.out.println("Durum: Gelistirilmesi Gerekiyor");
        } 
        
                            
              
        // Scanner'i kapatin (önemli pratik)
        input.close();
        
    }
}
