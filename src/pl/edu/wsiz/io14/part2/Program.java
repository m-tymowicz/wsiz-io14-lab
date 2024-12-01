package pl.edu.wsiz.io14.part2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();

        company.add(new Employee("Jan", "Kowalski", (byte) 30, Sex.MALE, 2800, new String[]{"PHP", "Java", "CSS"}));
        company.add(new Employee("Anna", "Nowak", (byte) 27, Sex.FEMALE, 4000, new String[]{"JS", "HTML", "CSS"}));
        company.add(new Employee("Piotr", "Kowalczyk", (byte) 35, Sex.MALE, 3500, new String[]{"Java", "CSS"}));
        company.add(new Employee("Piotr", "Kowalczyk", (byte) 35, Sex.MALE, 3000, new String[]{"Project Mgm"}));

        int operation;

        do {
            System.out.println("\nLista operacji:\n");
            System.out.println("1 - wypisz listę pracowników");
            System.out.println("2 - dodaj pracownika");
            System.out.println("3 - usuń pracownika");
            System.out.println("9 - zakończ program\n");
            System.out.print("Podaj numer operacji: ");

            operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    company.printEmployees();
                    break;

                case 2:
                    company.add();
                    break;

                case 3:
                    System.out.print("Podaj numer pracownika do usunięcia: ");
                    int employeeIndex = scanner.nextInt();
                    company.removeEmployee(employeeIndex);
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
