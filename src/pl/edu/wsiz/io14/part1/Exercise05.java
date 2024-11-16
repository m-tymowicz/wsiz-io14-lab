package pl.edu.wsiz.io14.part1;

import java.util.Scanner;

public class Exercise05 {

    /**

     5. Wczytaj dwie liczby: dzielną i dzielnik, wypisz informację czy można wykonać dzielenie całkowite.

     Podaj dzielną: 88
     Podaj dzielnik: 8

     88 dzieli się przez 8


     Podaj dzielną: 88
     Podaj dzielnik: 9

     88 nie dzieli się przez 9

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dzielną: ");
        int dividend = scanner.nextInt();

        System.out.print("Podaj dzielnik: ");
        int factor = scanner.nextInt();

        int modulo = dividend % factor;
        String result = modulo == 0 ? "" : "nie";

        System.out.printf("%d %s dzieli się przez %d", dividend, result, factor);
    }
}
