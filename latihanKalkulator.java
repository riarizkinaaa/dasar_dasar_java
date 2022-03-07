import java.util.Scanner;

public class latihanKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, hasil;
        char operator;
        System.out.print("masukkan nilai a= ");
        a = input.nextFloat();
        System.out.print("masukkan operator= ");
        operator = input.next().charAt(0);
        System.out.println("masukkan nilai b= ");
        b = input.nextFloat();
        System.out.println("input" + "=" + " " + a + operator + b);
        if (operator == '+') {
            hasil = a + b;
            System.out.println("hasi= " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("hasil= " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("hasil= " + hasil);
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("jika di bagi dengan 0 maka hasilnya tak hingga");
            } else {
                hasil = a / b;
                System.out.println("hasil= " + hasil);
            }
        } else {
            System.out.println("operator tidak di temukan");
        }

    }

}
