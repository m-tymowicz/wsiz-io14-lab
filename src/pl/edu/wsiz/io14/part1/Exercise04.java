package pl.edu.wsiz.io14.part1;

import java.util.Scanner;

public class Exercise04 {

    /**

     4. Wczytaj liczbę, następnie wypisz informację czy podana liczba jest parzysta czy nieparzysta.

     Podaj liczbę: 88
     Liczba 88 jest parzysta

     Podaj liczbę: 13
     Liczba 13 jest nieparzysta


     Do wczytania liczby użyj metody nextInt klasy Scanner

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;

        System.out.printf("Liczba %d jest %s", number, isEven ? "parzysta" : "nieparzysta");

//        if (isEven) {
//            System.out.print("Liczba " + number + " jest parzysta");
//        } else {
//            System.out.print("Liczba " + number + " jest nieparzysta");
//        }
    }
}
