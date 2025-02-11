package pl.edu.wsiz.io14.part2;

import java.util.ArrayList;
import java.util.HashSet;

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

    public String[] getSkills() {
        return skills;
    }

    public int getSalary() {
        return salary;
    }

    public abstract double getTotalSalary();

    @Override
    public String toString() {
        char sexChar = this.sex == Sex.FEMALE ? 'K' : 'M';
        String skillsStr = String.join(", ", skills);
        return String.format("%s %s %d %s %.2fzł [%s]", firstname, lastname, age, sexChar, getTotalSalary(), skillsStr);
    }

    void print() {
        System.out.println(this);
    }

    boolean isEqual(Employee employee) {
        boolean areFirstnamesSame = this.firstname.equalsIgnoreCase(employee.firstname);
        boolean areLastnamesSame = this.lastname.equalsIgnoreCase(employee.lastname);
        boolean areAgesSame = this.age == employee.age;
        boolean areSexesSame = this.sex == employee.sex;

        return areFirstnamesSame && areLastnamesSame && areAgesSame && areSexesSame;
    }

    protected static String[] parseSkills(String skillsStr){
        ArrayList<String> uniqueSkills = new ArrayList<>();
        HashSet<String> skillsSet = new HashSet<>();

        String[] skills = skillsStr.split(",");
        for (String skill : skills) {
            skill = skill.trim();

            if(!skillsSet.contains(skill.toLowerCase())){
                skillsSet.add(skill.toLowerCase());
                uniqueSkills.add(skill);
            }
        }

        return uniqueSkills.toArray(new String[0]);
    }
}
