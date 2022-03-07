public class latihan_bitwise {
    public static void main(String[] args) {
        byte a, b, c;
        String a_byte, b_byte, c_byte;

        System.out.println("=====shift lift=====");
        a = 40;
        b = (byte) (a << 3);
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s=%d\n", a_byte, a);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s=%d\n", b_byte, b);

        System.out.println("=====shift right=====");
        a = 11;
        b = (byte) (a >> 2);
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s=%d\n", a_byte, a);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s=%d\n", b_byte, b);

        System.out.println("=====or(|)=====");
        a = 15;
        b = 30;
        c = (byte) (a | b);
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s=%d\n", a_byte, a);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s=%d\n", b_byte, b);
        c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s=%d\n", c_byte, c);

        System.out.println("=====and(&)=====");
        a = 40;
        b = 60;
        c = (byte) (a & b);
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s=%d\n", a_byte, a);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s=%d\n", b_byte, b);
        c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s=%d\n", c_byte, c);

        System.out.println("=====XOR(^)=====");
        a = 50;
        b = 90;
        c = (byte) (a ^ b);
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s=%d\n", a_byte, a);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s=%d\n", b_byte, b);
        c_byte = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s=%d\n", c_byte, c);

        System.out.println("=====not(~)=====");
        a = 10;
        b = (byte) (~a);
        a_byte = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s=%d\n", a_byte, a);
        b_byte = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s=%d\n", b_byte, b);

    }

}
