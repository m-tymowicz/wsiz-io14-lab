package pl.edu.wsiz.io14.part2;

import java.util.Scanner;

public class Employee {
    private final String firstname;
    private final String lastname;
    private final byte age;
    private final Sex sex;
    private final int salary;
    private final String[] skills;

    public Employee(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.skills = skills;
    }

    void print() {
        char sexChar = this.sex == Sex.FEMALE ? 'K' : 'M';
        String skillsStr = String.join(", ", skills);
        System.out.printf("%s %s %d %s %dzł [%s]\n", firstname, lastname, age, sexChar, salary, skillsStr);
    }

    static Employee read() {
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
//      Sex sex = sexStr.toUpperCase().charAt(0) == 'K' ? Sex.FEMALE : Sex.MALE;

        System.out.print("Podaj zarobki:      ");
        int salary = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj umiejętności: ");
        String skillsStr = scanner.nextLine();
        String[] skills = skillsStr.split(",");
        for (int i = 0; i < skills.length; i++) {
            skills[i] = skills[i].trim();
        }

        return new Employee(firstname, lastname, age, sex, salary, skills);
    }

    boolean isEqual(Employee employee) {
        boolean areFirstnamesSame = this.firstname.equalsIgnoreCase(employee.firstname);
        boolean areLastnamesSame = this.lastname.equalsIgnoreCase(employee.lastname);
        boolean areAgesSame = this.age == employee.age;
        boolean areSexesSame = this.sex == employee.sex;

        return areFirstnamesSame && areLastnamesSame && areAgesSame && areSexesSame;
    }

}
