package model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private List<Department> departments;
    private String name;
    private int comMemCount;

    public Faculty() {
        departments = new ArrayList<>();
        name = "";
        comMemCount = 0;
    }

    public Faculty(String name, List<Department> departments, int comMemCount) {
        this.departments = departments;
        this.name = name;
        this.comMemCount = comMemCount;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getComMemCount() {
        return comMemCount;
    }

    public void setComMemCount(int comMemCount) {
        this.comMemCount = comMemCount;
    }

    public boolean contains(String depName) {
        for (Department department:
             departments) {
            if(department.getName().equals(depName)) return true;
        }

        return false;
    }

    public void addDepartment(Department department) {
        departments.add(department);
        department.setInFaculty(this);
    }

    public boolean agreeUpon(int voteCount) {
        return voteCount * 2 >= comMemCount && voteCount <= comMemCount;
    }
}
