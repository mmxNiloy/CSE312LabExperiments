package model;

import java.util.ArrayList;
import java.util.List;

public class Academy {
    private List<Faculty> faculties;
    public static final String[] FAC_NAMES = {
            "Engineering", "Science",
            "Arts", "Law",
            "Social Science", "Business Administration",
            "Life Science"
    };

    public Academy() {
        faculties = new ArrayList<>();
        for (String name:
             FAC_NAMES) {
            faculties.add(
                    new Faculty(name, new ArrayList<>(), (int)((Math.random() * 10.0) + 1))
            );
        }
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public static int indexOfFaculty(String facName) {
        for(int i = 0 ; i < FAC_NAMES.length ; i++) {
            if(facName.equals(FAC_NAMES[i])) return i;
        }

        return -1;
    }

    public boolean addDepartment(String facName, Department department, int voteCount) {
        if(department == null) return false;

        int index = indexOfFaculty(facName);
        if(index == -1) return false;

        boolean flag = faculties.get(index).agreeUpon(voteCount);
        if(!flag) return false;

        faculties.get(index).addDepartment(department);
        return true;
    }

    public boolean agreeUpon(String facName, String department) {
        int index = indexOfFaculty(facName);

        return index != -1 && !faculties.get(index).contains(department);
    }

    public int getTotalMemberCountOf(String facName) {
        return faculties.get(indexOfFaculty(facName)).getComMemCount();
    }
}
