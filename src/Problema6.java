/**
 * Created by Nicu Osan on 30.03.2017.
 */
public class Problema6 {

    /*6. Sa se calculeze factorialul unui numar a .*/

    public static void main(String[] args) {

        int a = 3;
        int b = 1;
        int c = 1;
        int sum = 0;

        for (int i = 0; i < a; i++) {
            sum = b * c;
            b = b+1;
            c = sum;

        }
        System.out.println("Fact " +sum);

    }
}
