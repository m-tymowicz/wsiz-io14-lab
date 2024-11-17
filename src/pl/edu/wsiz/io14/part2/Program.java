package pl.edu.wsiz.io14.part2;

public class Program {
    public static void main(String[] args) {
        Company company = new Company();

        Employee employee = new Employee("Jan", "Kowalski", (byte) 30);

        company.add(employee);
    }
}
