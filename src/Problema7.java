import java.lang.reflect.Array;

/**
 * Created by Nicu Osan on 30.03.2017.
 */
public class Problema7 {

    /*7. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea. */

    public static void main(String[] args) {
        int[] array = {8, 3, 1, 6, 4, 8, 15, 12, 13, 23};

        int index = 0;
        int first = array[0];
        int second = array[1];

        while (index < array.length - 2) {

            if (first > second) {
                System.out.println(first + "," + second + " ");
            }
            index += 1;
            first = array[index];
            second = array[index + 1];
        }


    }
}



