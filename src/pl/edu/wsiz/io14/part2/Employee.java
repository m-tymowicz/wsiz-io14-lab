package pl.edu.wsiz.io14.part2;

public abstract class Employee {
    private final String firstname;
    private final String lastname;
    private final byte age;
    private final Sex sex;
    private final int salary;
    private final String[] skills;

    public Employee(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.skills = skills;
    }

    public String toString() {
        char sexChar = this.sex == Sex.FEMALE ? 'K' : 'M';
        String skillsStr = String.join(", ", skills);
        return String.format("%s %s %d %s %dzł [%s]", firstname, lastname, age, sexChar, salary, skillsStr);
    }

    void print() {
        System.out.println(this.toString());
    }

    boolean isEqual(Employee employee) {
        boolean areFirstnamesSame = this.firstname.equalsIgnoreCase(employee.firstname);
        boolean areLastnamesSame = this.lastname.equalsIgnoreCase(employee.lastname);
        boolean areAgesSame = this.age == employee.age;
        boolean areSexesSame = this.sex == employee.sex;

        return areFirstnamesSame && areLastnamesSame && areAgesSame && areSexesSame;
    }

}
