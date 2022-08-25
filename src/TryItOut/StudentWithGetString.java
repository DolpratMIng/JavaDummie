package TryItOut;

public class StudentWithGetString extends Student {
    // inherited constructors
    public StudentWithGetString(String name, int id) {
        super(name, id);
    }

    public StudentWithGetString(String name, int id, double gpa) {
        super(name, id, gpa);
    }

    public StudentWithGetString(String name, int id, Major major) {
        super(name, id, major);
    }

    public StudentWithGetString(String name, int id, double gpa, Major major) {
        super(name, id, gpa, major);
    }

    // getString method
    public String getString() {
        String info = "Name:" + getName() + "; "; // create string to capture getname

        info += "ID:" + getId() + "; "; // create info to capture id with getID

        double gpa = getGpa(); // create emptybox for getGpa
        info += "GPA:" + ((gpa > 0.0)?gpa:"None") + "; ";

        Major major = getMajor();
        info += "Major:" + ((major != null)?major:"None");

        return info;
    }
}
