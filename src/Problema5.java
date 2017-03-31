/**
 * Created by Nicu Osan on 29.03.2017.
 */
public class Problema5 {

    /*5. Se dau doua numere a si n. sa se afiseze numarul a la puterea n */

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int sum = a;
        for (int i = 0; i < b-1; i++) {
            sum = sum * a;

        }
        System.out.println("Nr este: " +sum);

    }
}
