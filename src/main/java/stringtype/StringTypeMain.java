package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = "Hello John Doe".equals(message);
        boolean c = "Hello John Doe444".equals(message);

        System.out.println("prefix: " + prefix);
        System.out.println("name: " + name);
        System.out.println("message: " + message);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        String empty = "" + "";

        System.out.println(empty);
        System.out.println(empty.length());

        String abc = "Abcde";

        System.out.println(abc.length());
        System.out.println(abc.substring(0,1) + ", " + abc.substring(2,3));
        System.out.println(abc.substring(0,3));

    }

}
