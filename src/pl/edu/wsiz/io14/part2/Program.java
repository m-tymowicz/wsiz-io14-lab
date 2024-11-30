package pl.edu.wsiz.io14.part2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();

        company.add(new Employee("Jan", "Kowalski", (byte) 30));
        company.add(new Employee("Anna", "Nowak", (byte) 27));
        company.add(new Employee("Piotr", "Kowalczyk", (byte) 35));
        company.add(new Employee("Piotr", "Kowalczyk", (byte) 35));

        do {
            System.out.println("\nLista operacji:\n");
            System.out.println("1 - wypisz listę pracowników");
            System.out.println("2 - dodaj pracownika");
            System.out.println("3 - usuń pracownika");
            System.out.println("9 - zakończ program\n");
            System.out.print("Podaj numer operacji: ");

            int operation = scanner.nextInt();

            if (operation == 1) {
                company.printEmployees();
            } else if (operation == 2) {
                company.add();
            } else if (operation == 3) {
                System.out.print("Podaj numer pracownika do usunięcia: ");
                int employeeIndex = scanner.nextInt();
                company.removeEmployee(employeeIndex);
            } else if (operation == 9) {
                break;
            } else {
                System.out.println("Operacja o podanym numerze nie istnieje!");
            }
        }
        while (true);


    }
}
