import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class latihanKalkulatorSwichtCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, hasil;
        int pilihan;
        System.out.print("masukkan nilai a= ");
        a = input.nextFloat();
        System.out.print("masukkan nilai b= ");
        b = input.nextFloat();
        System.out.println("1.penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.pembagian");
        System.out.print("operator apa yang anda inginkan? ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                hasil = a + b;
                System.out.println(a + "+" + b + "=" + hasil);
                break;
            case 2:
                hasil = a - b;
                System.out.println(a + "-" + b + "=" + hasil);
                break;
            case 3:
                hasil = a * b;
                System.out.println(a + "*" + b + "=" + hasil);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("jika di bagi dengan 0 maka hasilnya tak hingga");
                } else {
                    hasil = a / b;
                    System.out.println(a + "/" + b + "=" + hasil);
                }
                break;
            default:
                System.out.println("operator yang anda masukkan tidak tersedia");

        }

    }

}
