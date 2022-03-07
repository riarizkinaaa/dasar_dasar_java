public class operator_aritmatika {
    public static void main(String[] args) {
        int nilai = 5;
        int nilai1 = 2;
        int hasil;
        // untuk penjumlahan
        System.out.println("=====penjumlahan======");
        hasil = nilai + nilai1;
        System.out.println(nilai + " + " + nilai1 + "=" + hasil);
        // untuk pengurangan
        System.out.println("=====pengurangan======");
        hasil = nilai - nilai1;
        System.out.println(nilai + " - " + nilai1 + " = " + hasil);
        // untuk perkalian
        System.out.println("=====perkalian======");
        hasil = nilai * nilai1;
        System.out.println(nilai + " * " + nilai1 + " = " + hasil);
        // untuk pembagian menggunakan integer
        System.out.println("=====pembagian menggunakan integer======");
        hasil = nilai / nilai1;
        System.out.println(nilai + " / " + nilai1 + " = " + hasil);
        // pembagian menggunakna float
        System.out.println("=====pembagian menggunakn float======");
        float x = 3;
        float z = 4;
        float hasilfloat = x / z;
        System.out.println(x + "/" + z + "=" + hasilfloat);
        // modulus(sisa bagi)
        System.out.println("=====modulus(sisa bagi)======");
        hasil = nilai % nilai1;
        System.out.printf("%d %% %d=%d\n", nilai, nilai1, hasil);
        System.out.println("=====PENAMBAHAN=====");
        System.out.println(
                "=====pre-increment(memasukkan nilai a dengan 1 terlebih dahulu sebelum memasukkan nilainya ke b)=====");
        int a = 30;
        int b;
        b = ++a;
        System.out.println(a + "  " + b);
        System.out.println("=====post-increment(memasukkan nilai a ke b dulu kemudian a di tambah 1)======");
        b = a++;
        System.out.println(a + " " + b);
        // sama halnya dengan dekement
        // contoh dari string.format();
        double d;
        String s;
        d = 0.4 / 0.5;
        System.out.println("Isi variabel d: " + d);

        s = String.format("%.2f", d);// string.format di gunakan untuk tipe data string oke
        System.out.println("Isi variabel s: " + s);

    }

}
