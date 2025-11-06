/*
 * Ad Soyad: Cansude Sayın
 * Ogrenci No: 250541096
 * Tarih: 06/11/2025
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 * 
 * Bu program calisandan bilgileri alir,
 * gelir, kesinti ve net maas hesaplamasi yapar.
 */
import java.util.Locale;
import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        // Sabit oran tanimlamalari
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Scanner objesi olusturun
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        // Baslik yazdirin
        System.out.println("====================================");
        System.out.println("MAAS BORDROSU");
        System.out.println("====================================");

        // Calisan adi soyadi
        System.out.print("Calisan ad soyad: ");
        String adSoyad = input.nextLine();

        // Brut maas
        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        // Haftalik calisma saati
        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        // Mesai saati
        System.out.print("Mesai saati (aylik): ");
        int mesaiSaat = input.nextInt();

        // Hesaplamalar
        double saatlikBrut = brutMaas / 160.0;
        double mesaiUcreti = saatlikBrut * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOraniYuzde = (toplamKesinti / toplamGelir) * 100.0;
        double saatlikNetKazanc = netMaas / 176.0; // 22 gün * 8 saat
        double gunlukNetKazanc = netMaas / 22.0;

        // Cikti bolumu
        System.out.println();
        System.out.println("Calisan: " + adSoyad);
        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat) : %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR : %.2f TL%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%) : %.2f TL%n", SGK_ORANI * 100, sgk);
        System.out.printf("Gelir Vergisi (%.1f%%) : %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%) : %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI : %.2f TL%n", toplamKesinti);

        System.out.printf("NET MAAS : %.2f TL%n", netMaas);

        System.out.println();
        System.out.println("ISTATISTIKLER:");
        System.out.printf("Kesinti Orani : %.1f%%%n", kesintiOraniYuzde);
        System.out.printf("Saatlik Net Kazanc : %.2f TL/saat%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc : %.2f TL/gun%n", gunlukNetKazanc);

        // Scanner'i kapatin (önemli pratik)
        input.close();
    }
}
