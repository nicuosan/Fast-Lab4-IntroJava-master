/**
 * Created by Nicu Osan on 01.04.2017.
 */

public class Problema8 {

    /*8. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
suma = 1+(x la puterea 1) +(x la puterea 2) + (x la puterea 3) + ….+ (x la puterea n) .

exemplu

x = 4
n=5

suma = 1 + 4 +(4*4)+(4*4*4) +(4*4*4*4) +(4*4*4*4*4)
*/
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += puterea(x, i);
        }
        System.out.println("Rezultat final " + sum);
    }

    public static int puterea(int x, int n) {
        int rezultat = 1;

        for (int i = 0; i < n; i++) {
            rezultat *= x;
        }
        System.out.println(rezultat);
        return rezultat;

    }


}
