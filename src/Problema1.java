public class Problema1 {

    /*1. Se da un sir de numere ordonate crescator. 
    Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1. 
    Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat. */

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int numar = 0;
        numar = SkeletonJava.readIntConsole("Intriduceti un numar ");
        int i=0;
        boolean found = false;
        for (i = 0; i < a.length; i++) {
            if (a[i] == numar) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("l-am gasit pe pozitia " +(i+1));
        } else {
            System.out.println("nu l-am gasit");
        }


        }
    }
