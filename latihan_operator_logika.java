import java.util.Scanner;

public class latihan_operator_logika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaibenar = 10;
        int nilaiTebakan;
        boolean statustebakan;
        System.out.print("masukkan nilai tebakan anda: ");
        nilaiTebakan = input.nextInt();
        // operasi logika
        statustebakan = (nilaiTebakan == nilaibenar);
        System.out.println("tebakan anda: " + statustebakan);
        // operasi aljabar boolean(or)(and)
        System.out.print("masukkan nilai antara 4 dan 9: ");
        nilaiTebakan = input.nextInt();
        statustebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("hasinya adalah: " + statustebakan);
        // untuk or
        System.out.print("masukkan nilai antara 5 dan 10: ");
        nilaiTebakan = input.nextInt();
        statustebakan = (nilaiTebakan > 5) || (nilaiTebakan < 10);
        System.out.println("hasilnnya: " + statustebakan);

    }

}
