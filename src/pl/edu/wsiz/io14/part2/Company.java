package pl.edu.wsiz.io14.part2;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee newEmployee) {

        boolean exists = false;
        for (Employee employee : employees) {
            if (employee.isEqual(newEmployee)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Pracownik o tych samych danych znajduje się już na liście!");
        } else {
            employees.add(newEmployee);
        }
    }

    void add() {
        Employee employee = Employee.read();

        add(employee);
    }

    void removeEmployee(int index) {
        boolean isIndexValid = index >= 1 && index <= employees.size();
        if (isIndexValid) {
            employees.remove(index - 1);
        } else {
            System.out.println("Lista nie zawiera pracownika o podanym numerze porządkowym.");
        }
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
