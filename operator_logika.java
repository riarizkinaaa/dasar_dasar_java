public class operator_logika {
    public static void main(String[] args) {
        // or,and,xor,negasi
        System.out.println("-----or(||)-----");
        boolean a, b, c;
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + "||" + b + "=" + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + "||" + b + "=" + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + "||" + b + "=" + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + "||" + b + "=" + c);
        System.out.println("-----and(&&)-----");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + "=" + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + "=" + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + "=" + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + "=" + c);
        System.out.println("-----xor(^)-----");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "=" + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "=" + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "=" + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "=" + c);
        System.out.println("-----negasi(!)-----");
        a = true;
        c = !a;
        System.out.println("c->" + a);

    }

}
