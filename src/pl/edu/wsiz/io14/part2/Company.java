package pl.edu.wsiz.io14.part2;

import java.util.ArrayList;
import java.util.HashMap;

public class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();
    private final Logger logger;

    public Company(Logger logger) {
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

    public void printSalaryBySkill() {
        HashMap<String, ArrayList<Double>> skillWithSalaries = new HashMap<>();

        for (Employee employee : employees) {
            for (String skill : employee.getSkills()) {
                if (!skillWithSalaries.containsKey(skill)) {
                    skillWithSalaries.put(skill, new ArrayList<>());
                }

                skillWithSalaries.get(skill).add(employee.getTotalSalary());
            }
        }

        // find max skill length
        int maxSkillLength = 0;
        for (String skill : skillWithSalaries.keySet()) {
            if (skill.length() > maxSkillLength) {
                maxSkillLength = skill.length();
            }
        }

        // build format string with maxSkillLength
        String format = "%-" + (maxSkillLength + 2) + "s%.2fzł\n";

        // add empty line at the beginning
        System.out.println();

        for (String skill : skillWithSalaries.keySet()) {
            ArrayList<Double> salaries = skillWithSalaries.get(skill);

            double sum = 0;
            for (Double salary : salaries) {
                sum += salary;
            }

            double average = sum / salaries.size();

            System.out.printf(format, skill, average);
        }
    }
}
