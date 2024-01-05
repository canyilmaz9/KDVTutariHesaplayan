import java.util.Scanner;

public class KDVTutariHesaplayan {

    public static void main(String[] args) {

        // Değerler tanımlandı.
       double KDVsizfiyat, KDVtutari, KDVlifiyat;

       //input almak için obje oluşturuldu ve kullanıcıya ürün fiyatı sorulu, dönüş alındı.
       Scanner input = new Scanner(System.in);
       System.out.print("KDVsiz fiyatı giriniz: ");
       KDVsizfiyat = input.nextDouble();

       //KDVsiz fiyatı 1000'den fazla olup olmadığı kontrol edilip boolean değişkene atandı.
       boolean KDVorani = KDVsizfiyat > 1000;
       //Boolean sonucuna göre KDV tutarı hesaplandı.
       KDVtutari = KDVorani ? KDVsizfiyat*0.08 : KDVsizfiyat* 0.18;
        System.out.println("Hesaplanan KDV Tutari: " + KDVtutari);
        KDVlifiyat =  KDVsizfiyat + KDVtutari;
        System.out.println("KDV'li fiyatı: "+ KDVlifiyat);
    }
}
