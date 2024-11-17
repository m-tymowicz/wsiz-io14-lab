package pl.edu.wsiz.io14.part2;

import java.util.Scanner;

public class Employee {
    String firstname;
    String lastname;
    byte age;
    
    void print() {
        System.out.printf("%s %s %d", firstname, lastname, age);
    }

    static Employee read() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Podaj imię:         ");
        employee.firstname = scanner.next();

        System.out.print("Podaj nazwisko:     ");
        employee.lastname = scanner.next();

        System.out.print("Podaj wiek:         ");
        employee.age = scanner.nextByte();

        return employee;
    }

}
