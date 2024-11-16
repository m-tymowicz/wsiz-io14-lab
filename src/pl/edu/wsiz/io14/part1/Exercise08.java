package pl.edu.wsiz.io14.part1;


import java.util.Scanner;

public class Exercise08 {

    /**
     * 8. Znajdź najmniejszą i największą spośród wprowadzonych liczb rzeczywistych.
     * <p>
     * Podaj ilość liczb: 6
     * <p>
     * Podaj liczbę nr 1: 33.2
     * Podaj liczbę nr 2: 11
     * Podaj liczbę nr 3: 89.1
     * Podaj liczbę nr 4: 3.567
     * Podaj liczbę nr 5: 66.9
     * Podaj liczbę nr 6: 47
     * <p>
     * Najmniejsza z podanych liczb to: 3.567
     * Największa z podanych liczb to: 89.1
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ilość liczb: ");
        int length = scanner.nextInt();

        System.out.print("\n");

        double min = Double.MAX_VALUE, max = -Double.MAX_VALUE;

        for (int i = 1; i <= length; i++) {
            System.out.printf("Podaj liczbę nr %d: ", i);

            double number = scanner.nextDouble();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.printf("\nNajmniejsza z podanych liczb to: %f", min);
        System.out.printf("\nNajwiększa z podanych liczb to: %f", max);
    }
}
