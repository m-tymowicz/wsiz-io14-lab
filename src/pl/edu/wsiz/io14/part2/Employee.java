package pl.edu.wsiz.io14.part2;

public class Employee {
    String firstname;
    String lastname;
    byte age;
    
    void print() {
        System.out.printf("%s %s %d", firstname, lastname, age);
    }
}
