package tutorials;

import java.util.Random;
import java.util.Scanner;

public class _30_Examples {
    public static void main(String[] args) {
        //sayi bulmaca oyunu
        //Bilgisayar 1 ve 10 aras�nda bi say� olu�tursun
        //kullan�c� da 4 hakk� ile bu say�y� bulmaya �al��s�n
        //kullan�c�n�n her yanl���nda hakk� 1 azal�cak
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
