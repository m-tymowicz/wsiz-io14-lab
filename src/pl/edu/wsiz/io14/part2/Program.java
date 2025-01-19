package pl.edu.wsiz.io14.part2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Logger[] loggers = {
                new FileLogger("company-info-log.txt", true, false),
                new FileLogger("company-error-log.txt", false, true),
                new ConsoleLogger()
        };
        Company company = new Company(new MultiLogger(loggers));

        company.add(new Developer("Jan", "Kowalski", (byte) 30, Sex.MALE, 2800, new String[]{"PHP", "Java", "CSS"}));
        company.add(new Manager("Anna", "Nowak", (byte) 27, Sex.FEMALE, 4000, new String[]{"JS", "HTML", "CSS", "Project Mgm"}, 3));
        company.add(new Manager("Piotr", "Kowalczyk", (byte) 35, Sex.MALE, 3500, new String[]{"Java", "CSS"}, 7));
        company.add(new Developer("Piotr", "Kowalczyk", (byte) 35, Sex.MALE, 3000, new String[]{"Project Mgm"}));

        int operation;

        do {
            System.out.println("\nLista operacji:\n");
            System.out.println("1 - wypisz listę pracowników");
            System.out.println("2 - dodaj programistę");
            System.out.println("3 - dodaj kierownika");
            System.out.println("4 - usuń pracownika");
            System.out.println("5 - wypisz średnie zarobki dla umiejętności");
            System.out.println("9 - zakończ program\n");
            System.out.print("Podaj numer operacji: ");

            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    company.printEmployees();
                    break;

                case 2:
                    Developer developer = Developer.read();
                    company.add(developer);
                    break;

                case 3:
                    Manager manager = Manager.read();
                    company.add(manager);
                    break;

                case 4:
                    System.out.print("Podaj numer pracownika do usunięcia: ");
                    int employeeIndex = scanner.nextInt();
                    company.removeEmployee(employeeIndex);
                    break;

                case 5:
                    company.printSalaryBySkill();
                    break;

                case 9:
                    break;

                default:
                    System.out.println("Operacja o podanym numerze nie istnieje!");

            }
        }
        while (operation != 9);

    }
}
