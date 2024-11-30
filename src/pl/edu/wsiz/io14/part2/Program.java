package pl.edu.wsiz.io14.part2;

public class Program {
    public static void main(String[] args) {
        Company company = new Company();

        company.add( new Employee("Jan", "Kowalski", (byte) 30));
        company.add( new Employee("Anna", "Nowak", (byte) 27));
        company.add( new Employee("Piotr", "Kowalczyk", (byte) 35));
        company.add( new Employee("Piotr", "Kowalczyk", (byte) 35));

        company.printEmployees();

        company.removeEmployee(1);

        company.printEmployees();

        company.removeEmployee(2);

        company.printEmployees();

        company.removeEmployee(0);
        company.removeEmployee(-2);
    }
}
