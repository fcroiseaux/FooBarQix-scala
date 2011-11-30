package fcx.codestory;

/**
 * Created by IntelliJ IDEA.
 * User: croiseaux
 * Date: 29/11/11
 * Time: 22:36
 * To change this template use File | Settings | File Templates.
 */
public class FooBarQix3 {
    /*
  * norm retourne la chaine s si i est egal a 0, retourne une chaine vide sinon
  */
    public static String norm(String s, int i) {
        int r = (1 / (1 + Math.abs(i)));
        return s.substring((1 - r) * s.length());
    }

    public static String convert(int i) {
        String s = norm("Foo", i % 3); // i est divible par 3
        s = s + norm("Bar", i % 5); // i est divible par 5
        s += norm("Qix", i % 7); // i est divible par 7
        s += norm("Foo", (i / 10 - 3) % 10); // i commence par 3
        s += norm("Bar", (i / 10 - 5) % 10); // i commence par 5
        s += norm("Qix", (i / 10 - 7) % 10); // i commence par 7
        s += norm("Foo", (i - 3) % 10); // i se termine par 3
        s += norm("Bar", (i - 5) % 10); // i se termine par 5
        s += norm("Qix", (i - 7) % 10); // i se termine par 7
        return norm(String.valueOf(i), s.length()) + s; // si s.size = 0 on retourne i, s sinon
    }

    public static void main(String[] s) {
        for (int i = 1; i < 100; i++) {
            System.out.println(convert(i));
        }
    }

}
