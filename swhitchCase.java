import java.util.Scanner;

public class swhitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pillihan;
        System.out.print("kamu pilih dia apa aku?");
        pillihan = input.nextLine();

        switch (pillihan) {
            case "kamu":
                System.out.println("nyakin,serius,dia lebih cantik loh");
                System.out.println("dia juga baik,yakin gak pilih dia?");
                break;
            case "dia":
                System.out.println("terima kasih ya sudah memilih dia :)");
                break;
            default:
                System.err.println("pertanyaanku adalah mau pilih dia apa aku,jangan jawab yang lain bego!");

        }

    }

}
