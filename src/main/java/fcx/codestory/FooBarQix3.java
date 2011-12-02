package fcx.codestory;

public class FooBarQix3 {

    static String[] rpl = {"", "", "", "Foo", "", "Bar", "", "Qix", "", ""};

    /*
    * norm retourne la chaine s si i est egal a 0, retourne une chaine vide sinon
    */
    private static final String norm(String s, int i) {
        int r = (1 / (1 + Math.abs(i)));
        return s.substring((1 - r) * s.length());
    }

    public static final String convert(int i) {
        String s = "";
        for (int nb = 1; nb < 10; nb++)
            s += norm(rpl[nb], i % nb);
        for (int exp = 1; exp >= 0; exp--)
            for (int nb = 1; nb < 10; nb++)
                s += norm(rpl[nb], (i / ((int) Math.pow(10, exp)) - nb) % 10);    // i contient nb en exp ème position
        return norm(String.valueOf(i), s.length()) + s; // si s.size = 0 on retourne i, s sinon
    }


    public static void main(String[] s) {
        for (int i = 1; i < 100; i++)
            System.out.println(convert(i));
    }

}
