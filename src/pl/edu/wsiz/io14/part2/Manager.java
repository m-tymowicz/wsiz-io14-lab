package pl.edu.wsiz.io14.part2;

import java.util.Scanner;

public class Manager extends Employee {
    public Manager(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    static Manager read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:         ");
        String firstname = scanner.next();

        System.out.print("Podaj nazwisko:     ");
        String lastname = scanner.next();

        System.out.print("Podaj wiek:         ");
        byte age = scanner.nextByte();

        System.out.print("Podaj płeć:         ");
        String sexStr = scanner.next();

        Sex sex = sexStr.substring(0, 1).equalsIgnoreCase("K") ? Sex.FEMALE : Sex.MALE;

        System.out.print("Podaj zarobki:      ");
        int salary = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj umiejętności: ");
        String skillsStr = scanner.nextLine();
        String[] skills = skillsStr.split(",");
        for (int i = 0; i < skills.length; i++) {
            skills[i] = skills[i].trim();
        }

        return new Manager(firstname, lastname, age, sex, salary, skills);
    }

    @Override
    public String toString() {
        return "K " + super.toString();
    }
}
