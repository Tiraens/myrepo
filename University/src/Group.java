public class Group extends Faculty {

    protected int groupId;


    public Group(FacultyName facultyname,  int groupId) {
        super(facultyname);
        this.groupId = groupId;

    }
}
