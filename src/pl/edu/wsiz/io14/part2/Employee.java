package pl.edu.wsiz.io14.part2;

import java.util.Scanner;

public class Employee {
    private final String firstname;
    private final String lastname;
    private final byte age;
    private final Sex sex;

    public Employee(String firstname, String lastname, byte age, Sex sex) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
    }

    void print() {
        char sexChar = this.sex == Sex.FEMALE ? 'K' : 'M';
        System.out.printf("%s %s %d %s\n", firstname, lastname, age, sexChar);
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

        return new Employee(firstname, lastname, age, sex);
    }

    boolean isEqual(Employee employee) {
        boolean areFirstnamesSame = this.firstname.equalsIgnoreCase(employee.firstname);
        boolean areLastnamesSame = this.lastname.equalsIgnoreCase(employee.lastname);
        boolean areAgesSame = this.age == employee.age;
        boolean areSexesSame = this.sex == employee.sex;

        return areFirstnamesSame && areLastnamesSame && areAgesSame && areSexesSame;
    }

}
