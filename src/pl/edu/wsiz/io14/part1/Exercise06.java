package pl.edu.wsiz.io14.part1;

import java.util.Scanner;

public class Exercise06 {

    /**

     6. Wczytaj promień. Oblicz i wypisz obwód i pole koła.

     Podaj promień: 10.5

     Obwód: 65.97
     Pole: 346.36

     Dla zwiększenia dokładności obliczeń możesz wykorzystać stałą: Math.PI
     W celu ustalenia długości części dziesiętnej przy konwersji do łańcucha znaków użyj metody printf:

     System.out.printf("Pole: %.2f", area)

     Do wczytania liczby rzeczywistej użyj metody nextDouble klasy Scanner.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj promień: ");

        double r = scanner.nextDouble();

        System.out.printf("Obwód: %.2f\n", 2 * Math.PI * r);
        System.out.printf("Pole: %.2f", Math.PI * r * r);
    }
}
