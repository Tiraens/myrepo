public class Faculty {
    protected FacultyName facultyname;

    public FacultyName getFacultyname() {
        return facultyname;
    }

    public void setFacultyname(FacultyName facultyname) {
        this.facultyname = facultyname;
    }

    public Faculty(FacultyName facultyname) {
        this.facultyname = facultyname;
    }
}
