public class operator_unary {
    public static void main(String[] args) {
        // unary adalah operator yang di gunakan untuk satu variabel saja
        // unary (+)dan(-)
        int angka = 10;
        System.out.println("nilai angka dengan'-' adalah " + -angka);
        System.out.println("nilai angka dengan'+' adalah " + +angka);
        // unary increment(++) dan dekrement(--) contoh
        // prefix(++a);
        // postfix(a++);
        angka++;
        System.out.println("nilai dari increment'++' adalah " + angka++);
        angka--;
        System.out.println("nilai dari dekrement'--' adalah " + angka--);
        // unary boolean untuk negasi(!)contoh
        boolean bambang = true;
        System.out.println("nilai boolean adalah= " + !bambang);

    }

}
