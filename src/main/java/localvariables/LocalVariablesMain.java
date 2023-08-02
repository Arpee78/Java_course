package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b: " + b);
        int a = 2;
        System.out.println("a:" + a);
        int i = 3;
        int j = 4;
        int k = i;
        System.out.println("i: " + i + "   j: " + j + "   k: " + k );
        String s = "Hello World";
        System.out.println("s: " + s);
        String t = s;
        System.out.println("t: " + t);

        {
            System.out.println("Belső blokk");
            int x = 0;
            System.out.println("x: " + x);
            System.out.println("a: " + a);
        }
    }
}
