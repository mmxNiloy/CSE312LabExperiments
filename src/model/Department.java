package model;

public class Department {
    private String name;
    private Faculty inFaculty;

    public Department() {}

    public Department(String name, Faculty inFaculty) {
        this.name = name;
        this.inFaculty = inFaculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getInFaculty() {
        return inFaculty;
    }

    public void setInFaculty(Faculty inFaculty) {
        this.inFaculty = inFaculty;
    }
}
