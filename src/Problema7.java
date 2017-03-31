/**
 * Created by Nicu Osan on 30.03.2017.
 */
public class Problema7 {

    /*7. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea. */

    public static void main(String[] args) {
        int[] a = {9, 3, 1, 6, 4, 8, 15, 12, 13, 23};
        int c = a[0];
        int b = a[1];
        do {


        boolean cond = (a[c] > a[b]);
        if (cond) {
            System.out.print(c + "," + b);
            c = a[0 + 1];
            b = a[1 + 1];
        }
        else {
            continue;

        }
    }

        while (a.length ==9);
}}


