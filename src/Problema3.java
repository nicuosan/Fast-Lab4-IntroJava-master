/**
 * Created by Nicu Osan on 29.03.2017.
 */
public class Problema3 {

    /*3. Se citesc numere naturale pânã când se introduce numãrul 0.
    Afisati suma obtinutã prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11.*/

    public static void main(String[] args) {

        int numere = 0;
        int sum = 0;
        do {
            numere = SkeletonJava.readIntConsole("Intriduceti numarul ");
            boolean cond = ((numere > 4) && numere < 11);
            if (cond) {
                sum = numere + sum;
            }

        }
        while (numere != 0);
        System.out.println(sum);

    }
}
