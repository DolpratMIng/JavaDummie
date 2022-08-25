package TryItOut;

public class Student {
    private String name;
    private int id;
    private double gpa = 0.0; // but some student might not have a GPA/ Major
    private Major major = null; // but some student might not have a GPA/Major


    // constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public Student(String name, int id, Major major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }

    public Student(String name, int id, double gpa, Major major) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.major = major;
    }

    public void display() {
        String info = "Name:" + name + "; ";
        info += "ID:" + id + "; ";
        info += "GPA:" + ((gpa > 0.0)?gpa:"None") + "; "; // ? condition operator work the same as if else
        info += "Major:" + ((major != null)?major:"None"); // ? condition operator work the same as if else
        System.out.println(info);
    }

    // set and get
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}
