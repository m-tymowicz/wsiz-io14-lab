package pl.edu.wsiz.io14.part2;

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    void printEmployees() {
        System.out.println("--------------------");

        for (Employee employee : employees) {
            int index = employees.indexOf(employee);
            System.out.print(index + 1 + "  ");
            employee.print();
        }

        System.out.println("--------------------");
    }
}
