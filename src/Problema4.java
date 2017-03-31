/**
 * Created by Nicu Osan on 29.03.2017.
 */
public class Problema4 {
    /*4. Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24]. Altfel sa se afiseze ‘false'*/

    public static void main(String[] args) {

        int numere = 0;
        numere = SkeletonJava.readIntConsole("Intriduceti numarul ");

        boolean cond = ((numere >= 9) && numere <= 24);
        if (cond) {
            System.out.print("True");
        } else {
            System.out.println("False");
        }

    }
}


