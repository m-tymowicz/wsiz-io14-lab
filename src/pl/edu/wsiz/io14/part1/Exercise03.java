package pl.edu.wsiz.io14.part1;

import java.util.Scanner;

public class Exercise03 {

    /**

     3. Poproś użytkownika o wpisanie tekstu, następnie wypisz go w kolejnej linii:

     Wpisz tekst: Witaj!
     Wpisany tekst to: Witaj!

     Do zaczytania tekstu użyj metody next klasy Scanner.
     Do konstruktora klasy Scanner przekaż domyślny strumień wejściowy: System.in

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz tekst: ");
        String text = scanner.next();

        System.out.print("Wpisany tekst to: " + text);
    }
}
