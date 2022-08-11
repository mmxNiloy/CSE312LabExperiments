package Models;

public class Student {
    private String name;
    private int id;
    private String deptName;

    public Student() {
    }

    public Student(String name, int id, String deptName) {
        this.name = name;
        this.id = id;
        this.deptName = deptName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public static int upperBound(float[] arr, float val) {
        int low = 0;
        int high = arr.length;
        int mid = 0;

        while(low < high) {
            mid = ((high - low) >> 1) + low;

            if(arr[mid] < val) low = mid + 1;
            else if(arr[mid] > val) high = mid;
            else return mid;
        }

        return low;
    }
}
