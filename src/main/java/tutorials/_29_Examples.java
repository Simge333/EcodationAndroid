package tutorials;

import java.util.Scanner;

public class _29_Examples {
    public static void main(String[] args) {
        //kullan�c�dan �ifre ve �ifretekrar� al�nacak
        //ve ikisi kar��la�t�r�lacak e�itse e�it diyecek yoksa de�ildir diyecek
        Scanner scan =new Scanner(System.in);

        System.out.println("Sifre Giriniz : ");
        String password = scan.nextLine();

        System.out.println("Sifre Tekrar Giriniz : ");
        String password1 = scan.nextLine();

        if(password.equals(password1)){   //dikkat
            System.out.println("esittir");
        }
        else{
            System.out.println("degildir");
        }

    }
}
