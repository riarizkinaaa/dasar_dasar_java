import java.util.Scanner;

public class operator_ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pertanyaan;
        System.out.print("you are happy? ");
        pertanyaan = input.next();
        // switch (pertanyaan) {
        // case "yes":
        // boolean isHappy = true;
        // String mood = (isHappy == true) ? ("you Happy!") : ("you Sad!");
        // System.out.println(mood);
        // break;
        // case "no":
        // boolean nohappy = false;
        // String sad = (nohappy == true) ? ("you happy") : ("you sad!");
        // System.out.println(sad);
        // }

        // }
        int angka, hasil;
        System.out.print("masukkan angka: ");
        angka = input.nextInt();
        hasil = (angka == 10) ? (angka * angka) : (angka / 2);
        System.out.println("hasilnya=" + hasil);
    } // memakai boolean;

}
