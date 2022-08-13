package model;

import java.util.Date;

public class AdmitCard {
    private String name;
    private int ID;
    private String semester;
    private String key;

    public AdmitCard() {
    }

    public AdmitCard(String name, int ID, String semester) {
        this.name = name;
        this.ID = ID;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getKey() {
        return key;
    }

    public void generateKey() {
        key = "sid-" + ID + "-tstamp-" + (new Date().getTime()) + "";
    }
}
