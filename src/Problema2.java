/**
 * Created by Nicu Osan on 29.03.2017.
 */
public class Problema2 {

    /*2. Sa se calculeze suma primelor n numere naturale, unde n este declarat ca si 
    int n = 20; //sau o alta valoare */

    public static void main(String[] args) {
        double numar;
        double sum = 0;
        int n = 3;

        for (int i = 1; i <= n; i++)
        {
            numar = SkeletonJava.readDoubleConsole("Introduceti numar: ");
            sum = sum + numar;
        }
        System.out.print("Media este: " + (sum / n));

    }
}
