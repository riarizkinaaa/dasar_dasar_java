public class operator_komparasi {
    public static void main(String[] args) {
        // operator_komparasi akan menghasilkan nilai boolean(==,!=,<,>,<=,>=)
        // --persamaan
        System.out.println("-----persamaan-----");
        int a, b;
        boolean hasil;
        a = 10;
        b = 10;
        hasil = (a == b);
        System.out.printf("%d apakah sama dengan %d-->%s \n", a, b, hasil);
        // pertidaksamaan
        System.out.println("-----pertidaksamaan-----");
        hasil = (a != b);
        System.out.printf("%d apakah tidak sama dengan %d--> %s \n", a, b, hasil);
        // kurang dari
        System.out.println("-----kurang dari-----");
        hasil = (a < b);
        System.out.printf("%d apakah kurang dari %d-->%s\n", a, b, hasil);
        // lebih dari
        System.out.println("-----lebih dari-----");
        hasil = (a > b);
        System.out.printf("%d apakah lebih dari %d-->%s\n", a, b, hasil);
        // kurang dari sama dengan
        System.out.println("-----kurang dari sama dengan-----");
        hasil = (a <= b);
        System.out.printf("%d apakah kurang dari sama dengan %d-->%s\n", a, b, hasil);
        // lebih dari sama dengan
        System.out.println("-----lebih dari sama dengan-----");
        hasil = (a >= b);
        System.out.printf("%d apakah lebih dari sama dengan %d-->%s\n", a, b, hasil);
        // bisa juga untuk char dan string contoh
        System.out.println("-----materi tambahan-----");
        boolean Hasil;
        Hasil = 'z' == 'Z';
        System.out.println("apakah nilai nya sama? " + Hasil);
        Hasil = "bambang" != "BAMBANG";
        System.out.println("apakah nilainya sama?" + Hasil);
        Hasil = 'z' < 'b';
        System.out.println("apakah z lebih kecin dari b?" + Hasil);

    }

}
