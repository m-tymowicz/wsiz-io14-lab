package pl.edu.wsiz.io14.part2;

public class Program {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//
//        employee.firstname = "Jan";
//        employee.lastname = "Kowalski";
//        employee.age = 30;

        Employee employee = Employee.read();

        employee.print();
    }
}
