package pl.edu.wsiz.io14.part2;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();
    private final ConsoleLogger logger;

    public Company(ConsoleLogger logger) {
        this.logger = logger;
    }

    public void add(Employee newEmployee) {

        boolean exists = false;
        for (Employee employee : employees) {
            if (employee.isEqual(newEmployee)) {
                exists = true;
                break;
            }
        }

        if (exists) {
            logger.error(String.format("Próba dodania pracownika o tych samych danych: %s", newEmployee));
        } else {
            employees.add(newEmployee);
            logger.info(String.format("Pracownik dodany (%s)", newEmployee));
        }
    }

    void removeEmployee(int index) {
        boolean isIndexValid = index >= 1 && index <= employees.size();
        if (isIndexValid) {
            Employee removedEmployee = employees.remove(index - 1);
            logger.info(String.format("Pracownik usunięty (%s)", removedEmployee));
        } else {
            logger.error("Próba usunięcia pracownika o niepoprawnym numerze porządkowym: " + index);
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
