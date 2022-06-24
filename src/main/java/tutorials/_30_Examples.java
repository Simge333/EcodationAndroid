package tutorials;

import java.util.Random;
import java.util.Scanner;

public class _30_Examples {
    public static void main(String[] args) {
        //sayi bulmaca oyunu
        //Bilgisayar 1 ve 10 arasýnda bi sayý oluþtursun
        //kullanýcý da 4 hakký ile bu sayýyý bulmaya çalýþsýn
        //kullanýcýnýn her yanlýþýnda hakký 1 azalýcak
        Random random = new Random();
        Scanner scan =new Scanner(System.in);

        int sayi=random.nextInt(1,11);
        System.out.println(sayi);
        int tahmin,sayac=4;

        while(sayac>0){
            System.out.println("sayi tahmininizi giriniz : ");
            tahmin=scan.nextInt();

            if(sayi==tahmin){
                System.out.println("Tebrikler dogru bildiniz.");
                break;
            }
            else{
                System.out.println("tekrar deneyiniz");
                sayac--;
            }
        }

    }
}
