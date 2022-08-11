package model;

public class Employee {
    private String name;
    private String designation;
    private float basicSalary;

    public Employee() {}
    public Employee(String name, String designation, float basicSalary) {
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String[] toStringArray() {
        return new String[] {name, designation, String.valueOf(basicSalary)};
    }
}
