public class operasi_bitwise {
    public static void main(String[] args) {
        // bitwise adalah operator untuk melakukan operasi pada bit
        byte a = 4;
        byte b, c;
        String a_byte, b_byte, c_bits;
        // 1-shift left(geser ke kiri)(<<)
        System.out.println("=====shift left=====");
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s=%d\n", a_byte, a);
        b = (byte) (a << 1);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s=%d \n", b_byte, b);

        // 2-shift right(geser ke kanan)(>>)
        System.out.println("=====shift right=====");
        a = 24;
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s=%d\n", a_byte, a);
        b = (byte) (a >> 3);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s=%d\n", b_byte, b);

        // 3-or(atau)(|)
        System.out.println("=====or(|)=====");
        a = 24;
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s=%d\n", a_byte, a);
        b = 12;
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s=%d\n", b_byte, b);
        c = (byte) (a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s=%d\n", c_bits, c);

        // 4-and(&)
        System.out.println("=====and (&)=====");
        a = 24;
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s=%d\n", a_byte, a);
        b = 12;
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s=%d\n", b_byte, b);
        c = (byte) (a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s=%d\n", c_bits, c);

        // 5-not(~)
        System.out.println("=====not(~)=====");
        a = 24;
        b = (byte) (~a);
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s=%d\n", a_byte, a);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s=%d\n", b_byte, b);
        // 6-xor(^)
        System.out.println("=====xor(^)=====");
        a = 24;
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s=%d\n", a_byte, a);
        b = 12;
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s=%d\n", b_byte, b);
        c = (byte) (a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s=%d\n", c_bits, c);

    }

}
