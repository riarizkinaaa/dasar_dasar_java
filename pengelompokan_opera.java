import java.util.Scanner;

public class pengelompokan_opera {
    public static void main(String[] args) {
        int a, b, c, d, hasil;
        hasil = (12 - 20) * 40;
        System.out.println(hasil);
        // urutan aritmarika =* dan / akan di exsekusi terlebih dahulu baru - +
        // jika ada di dalam kurung ()maka akan di eksekusi paling awal dari pada * dan
        // / contoh
        Scanner input = new Scanner(System.in);
        System.out.print("nilai a=");
        a = input.nextInt();
        System.out.print("nilai b= ");
        b = input.nextInt();
        System.out.print("nilai c= ");
        c = input.nextInt();
        System.out.print("nilia d= ");
        d = input.nextInt();
        hasil = (a - b) * c + d;
        System.out.println(hasil);
    }
}