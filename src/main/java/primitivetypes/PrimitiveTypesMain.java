package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {
        int a = 2;
        Integer b = 2;
        Integer c = a;
        Integer d = b;
        Integer e = Integer.valueOf(2);
        int f = Integer.valueOf(2);
        int g = Integer.valueOf(a);
        int h = Integer.valueOf(c);
        int i = Integer.parseInt("2");
        Integer j = Integer.parseInt("2");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(j);

        //k változó: a típusa legyen boolean, az értéke true!
        boolean k = true;

        //l változó: a típusa legyen Boolean, az értéke true!
        Boolean l = true;

        //m változó: a típusa legyen boolean, az értékét úgy add meg,
        // hogy a Boolean osztály megfelelő metódusával hozz létre egy új Boolean objektumot a true logikai literálból!
        boolean m = Boolean.valueOf(true);

        //n változó: a típusa legyen Boolean, az értékét úgy add meg,
        //hogy a Boolean osztály megfelelő metódusával hozz létre egy új Boolean objektumot a true logikai literálból!
        Boolean n = Boolean.valueOf(true);

        //o változó: a típusa legyen boolean, az értékét úgy add meg,
        //hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TrUe" szövegből!
        boolean o = Boolean.parseBoolean("TrUe");

        //p változó: a típusa legyen Boolean, az értékét úgy add meg,
        //hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TrUe" szövegből!
        Boolean p = Boolean.parseBoolean("TrUe");

        //q változó: a típusa legyen boolean, az értékét úgy add meg,
        //hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TreU" szövegből!
        boolean q = Boolean.parseBoolean("TreU");

        //r változó: a típusa legyen Boolean, az értékét úgy add meg,
        //hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TreU" szövegből!
        Boolean r = Boolean.parseBoolean("TreU");

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

    }


}
