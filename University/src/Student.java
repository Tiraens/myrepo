import java.util.HashMap;
import java.util.Map;

public class Student extends Group {

    private String name;
    Map marks;

    public Student(FacultyName facultyname, int groupId, String name, HashMap<Course,
            int[]> marks) {
        super(facultyname, groupId);
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "facultyname=" + facultyname +
                ", groupId=" + groupId +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map getMarks() {
        return marks;
    }

    public void setMarks(Map marks) {
        this.marks = marks;
    }



}



