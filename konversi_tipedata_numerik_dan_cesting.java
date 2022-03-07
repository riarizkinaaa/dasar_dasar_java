public class konversi_tipedata_numerik_dan_cesting {
    public static void main(String[] args) {
        int nilaiInt = 120;
        System.out.println("nilai integer= " + nilaiInt);
        // memperluas rentang ke tipe data yang lebih besar contoh
        long nilaiLong = nilaiInt;
        System.out.println("nilai long " + nilaiLong);
        // memperkecil rentang ke tipe data yang lebih kecil contoh
        short nilaiShort = (short) nilaiInt;
        System.out.println("nilai byte= " + nilaiShort);
        System.out.println("nilai max= " + Byte.MAX_VALUE);
        System.out.println("nilai min= " + Byte.MIN_VALUE);
        double nilaiDouble = nilaiInt;
        System.out.println("nilia double= " + nilaiInt);
        // casting(mengubah tipe data)contohnya adalh
        // -->byte nilaiBite=(byte)nilaiInt;
        // tipe data kecil ke besar perlu di tulis seperti yang di atas
        // konversi tipe data numerik ada (long,int,float,double,short,byte)
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("Konversi" + " int ke byte");
        b = (byte) i;
        System.out.println("i = " + i + " b = " + b);
        System.out.println("\nKonver" + "si double ke byte.");
        b = (byte) d;
        System.out.println("d = " + d + " b= " + b);
        // 5 cara konversi tipe data di java
        // 1.konversi tipe data secara otomatis(Konversi data tipe dilakukan ketika dua
        // tipe data dikonversi secara otomatis)contoh
        int I = 100;
        float F = I;
        long L = I;
        System.out.println("nilai int= " + I);
        System.out.println("nilai float= " + F);
        System.out.println("nilai long= " + L);
        // casting pembagian contoh
        // jika salah satu nya menjadi float maka hasilnya float
        int x = 60;
        int z = 30;
        float y = x / z;
        System.out.printf(" %d / %d= %f", x, z, y);

    }

}
