/*
 * Ad Soyad: Cansude Sayın
 * Ogrenci No: 250541096
 * Tarih: 06/11/2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayıcı
 * 
 * Bu program, kullanıcıdan dairenin yarıçapını alıp:
 * Dairenin alanını, çevresini ve çapını, kürenin hacmini ve yüzey alanını hesaplayarak Sonuçları virgülden sonra iki basamak (%.2f) olacak şekilde düzenli bir biçimde ekrana yazdırır.  
 */

import java.util.Scanner;

    public class GeometrikHesap {
        public static void main(String[] args) {
            // Sabit tanımlama
            final double PI = 3.14159;

            // Scanner nesnesi 
            Scanner input = new Scanner(System.in);

            // Başlık
            System.out.println("=== GEOMETRIK HESAPLAYICI ===");

            // Yarıçapı alma
            System.out.print("Dairenin yaricapini girin (cm): ");
            double r = input.nextDouble();

            // Hesaplamalar
            double daireAlani = PI * Math.pow(r, 2);
            double daireCevresi = 2 * PI * r;
            double daireCapi = 2 * r;
            double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
            double kureYuzeyAlani = 4 * PI * Math.pow(r, 2);

            // Çıktılar
            System.out.println("SONUCLAR:");
            System.out.println("----------");
            System.out.printf("Daire Alani       : %.2f cm^2\n", daireAlani);
            System.out.printf("Daire Cevresi     : %.2f cm\n", daireCevresi);
            System.out.printf("Daire Capi        : %.2f cm\n", daireCapi);
            System.out.printf("Kure Hacmi        : %.2f cm^3\n", kureHacmi);
            System.out.printf("Kure Yuzey Alani  : %.2f cm^2\n", kureYuzeyAlani);

            // Scanner'ı kapatma
            input.close();
        }
    }
