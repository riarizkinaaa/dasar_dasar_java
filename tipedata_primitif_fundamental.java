public class tipedata_primitif_fundamental {
    public static void main(String[] args) {
        // tipe data
        // integer,bytes,short,long,double,float,char,boolean
        // kita akan membahas tentang integer
        System.out.println("=====integer=====");
        int i;
        System.out.println("nilai max= " + Integer.MAX_VALUE);
        System.out.println("nilai min= " + Integer.MIN_VALUE);
        System.out.println("besar integer= " + Integer.SIZE + " bit");
        System.out.println("besar integer= " + Integer.BYTES + " bytes");

        System.out.println("=====bytes=====");
        byte b = 10;
        System.out.println("nilai max= " + Byte.MAX_VALUE);
        System.out.println("nilai min= " + Byte.MIN_VALUE);
        System.out.println("besar Byte= " + Byte.SIZE + " bit");
        System.out.println("besar Byte= " + Byte.BYTES + " bytes");

        System.out.println("=====short=====");
        short s;
        System.out.println("nilai max= " + Short.MAX_VALUE);
        System.out.println("nilai min= " + Short.MIN_VALUE);
        System.out.println("besar Short= " + Short.SIZE + " bit");
        System.out.println("besar Short= " + Short.BYTES + " bytes");

        System.out.println("=====long=====");
        long L = 10L; // L di belakang 10 adalah penanda bahwa dia adalah long
        System.out.println("nilai max= " + Long.MAX_VALUE);
        System.out.println("nilai min= " + Long.MIN_VALUE);
        System.out.println("besar Long= " + Long.SIZE + " bit");
        System.out.println("besar Long= " + Long.BYTES + " bytes");

        System.out.println("=====double=====");
        double d = 10.5d;// koma dan bilangan real
        System.out.println("nilai max= " + Double.MAX_VALUE);
        System.out.println("nilai min= " + Double.MIN_VALUE);
        System.out.println("besar Double= " + Double.SIZE + " bit");
        System.out.println("besar Double= " + Double.BYTES + " bytes");

        System.out.println("=====float=====");
        float f = 12f;
        System.out.println("nilai max= " + Float.MAX_VALUE);
        System.out.println("nilai min= " + Float.MIN_VALUE);
        System.out.println("besar Float= " + Float.SIZE + " bit");
        System.out.println("besar Float= " + Float.BYTES + " bytes");

        System.out.println("=====charakter=====");
        char c = 'z';// memakai tanda kutip satu (ASCII)
        System.out.println("nilai =" + c);
        System.out.println("nilai max= " + Character.MAX_VALUE);
        System.out.println("nilai min= " + Character.MIN_VALUE);
        System.out.println("besar Character= " + Character.SIZE + " bit");
        System.out.println("besar Character= " + Character.BYTES + " bytes");

        System.out.println("=====boolean=====");
        boolean o = true;// memiliki dua niilai yaitu true dan false
        System.out.println("nilai max= " + Boolean.TRUE);
        System.out.println("nilai min= " + Boolean.FALSE);
    }

}
