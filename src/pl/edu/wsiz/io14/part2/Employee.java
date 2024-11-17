package pl.edu.wsiz.io14.part2;

import java.util.Scanner;

public class Employee {
    String firstname;
    String lastname;
    byte age;

    public Employee(String firstname, String lastname, byte age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    void print() {
        System.out.printf("%s %s %d", firstname, lastname, age);
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

}
