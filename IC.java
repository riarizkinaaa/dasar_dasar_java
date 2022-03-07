import java.util.*;

public class IC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int a, b, c;
        // System.out.print("masukkan nilai dari a:");
        // a = input.nextInt();
        // System.out.print("masukkan nilai dari b:");
        // b = input.nextInt();
        // c = a * b;
        // System.out.println("hasil= " + c);
        int a, b, c, pilihan;
        String a_byte, b_byte, c_byte;
        System.out.println("1.desimal ke biner");
        System.out.println("2.desimal dan biner (atau)");
        System.out.println("3.desimal dan biner (dan)");
        System.out.println("4.desimal dan biner shift left");
        System.out.println("5.desimal dan biner shift right");
        System.out.println("6.desimal dan biner (Xor)");
        System.out.println("7.desimal dan biner (not)");
        System.out.print("masukkan pilihan anda: ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("masukkan angka desimal= ");
                a = input.nextInt();
                a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
                System.out.printf("%s=%d\n", a_byte, a);
                break;
            case 2:
                System.out.print("masukkan nilai pertama= ");
                a = input.nextInt();
                System.out.print("masukkan nilai ke dua= ");
                b = input.nextInt();
                c = (byte) (a | b);
                a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
                System.out.printf("%s=%d\n", a_byte, a);
                b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
                System.out.printf("%s=%d\n", b_byte, b);
                System.out.println("--------------------");
                c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
                System.out.printf("%s=%d\n", c_byte, c);
                break;
            case 3:
                System.out.print("masukkan nilai pertama= ");
                a = input.nextInt();
                System.out.print("masukkan nilai kedua= ");
                b = input.nextInt();
                c = (byte) (a & b);
                a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
                System.out.printf("%s=%d\n", a_byte, a);
                b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
                System.out.printf("%s=%d\n", b_byte, b);
                System.out.println("--------------------");
                c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
                System.out.printf("%s=%d\n", c_byte, c);
                break;
            case 4:
                System.out.print("masukkan nilai awal: ");
                a = input.nextInt();
                a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
                System.out.printf("%s=%d\n", a_byte, a);
                b = (byte) (a >> 3);
                b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
                System.out.printf("%s=%d\n", b_byte, b);
            case 5:
                System.out.print("masukkan nilai awal: ");
                a = input.nextInt();
                a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
                b = (byte) (a << 3);
                b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
                System.out.printf("%s=%d\n", b_byte, b);
            case 6:
                System.out.print("masukkakn nilai awal: ");
                a = input.nextInt();
                a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
                System.out.print("masukkan nilai kedua: ");
                b = input.nextInt();
                b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
                System.out.printf("%s=%d\n", b_byte, b);
                c = (byte) (a ^ b);
                c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
                System.out.printf("%s=%d\n", c_byte, c);

        }

    }

}
