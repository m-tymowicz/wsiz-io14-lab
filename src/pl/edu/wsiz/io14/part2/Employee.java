package pl.edu.wsiz.io14.part2;

import java.util.Scanner;

public class Employee {
    private final String firstname;
    private final String lastname;
    private final byte age;

    public Employee(String firstname, String lastname, byte age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    void print() {
        System.out.printf("%s %s %d\n", firstname, lastname, age);
    }

    static Employee read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:         ");
        String firstname = scanner.next();

        System.out.print("Podaj nazwisko:     ");
        String lastname = scanner.next();

        System.out.print("Podaj wiek:         ");
        byte age = scanner.nextByte();

        return new Employee(firstname, lastname, age);
    }

    boolean isEqual(Employee employee) {
        boolean areFirstnamesSame = this.firstname.equalsIgnoreCase(employee.firstname);
        boolean areLastnamesSame = this.lastname.equalsIgnoreCase(employee.lastname);
        boolean areAgesSame = this.age == employee.age;

        return areFirstnamesSame && areLastnamesSame && areAgesSame;
    }

}
