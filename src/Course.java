public class Course {

    //Attributes
    String CourseCode;
    String CourseName;
    int MaxStudents;
    int MaxTeachers;
    String[] Students;
    String[] Teachers;
    int NumOfStudents;
    int NumOfTeachers;

    //Constructors - makes entity based on code, name, max students / teachers
    public Course() {
        System.out.println("Course not selected");
    }
    public Course(String CourseCode, String CourseName, int MaxStudents, int MaxTeachers) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.MaxStudents = MaxStudents;
        this.MaxTeachers = MaxTeachers;

        this.Students = new String[MaxStudents];
        this.Teachers = new String[MaxTeachers];
    }

    //Getters
    public String GetCourseCode() {
        return CourseCode;
    }
    public String GetCourseName() {
        return CourseName;
    }
    public int GetNumOfStudents() {
        return NumOfStudents;
    }
    public int GetNumOfTeachers() {
        return NumOfTeachers;
    }

    //Setters
    public void SetCourseCode(String NewCourseCodes) {
        this.CourseCode = NewCourseCodes;
    }
    public void SetCourseName(String NewCourseName) {
        this.CourseName = NewCourseName;
    }

    //Methods
    public void AddStudent(String Name) {
        if (NumOfStudents >= MaxStudents) {
            System.out.println("Cannot add more students");
            return;
        }
        for (int i = 0; i < NumOfStudents; i++) {
            if (Students[i].equals(Name)) {
                System.out.println(Name + " is already registered");
                return;
            }

        }
        Students[NumOfStudents] = Name;
        NumOfStudents++;

    }
    public void DropStudent(String Name) {
        for (int i = 0; i < NumOfStudents; i++) {
            if (Students[i].equals(Name)) {
                Students[i] = null;
                return;
            }
        }
        System.out.println("Student not found");

    }

    public void AddTeacher(String Name) {
        if (NumOfTeachers >= MaxTeachers) {
            System.out.println("Cannot add more teachers");
            return;
        }
        for (int i = 0; i < NumOfTeachers; i++) {
            if (Teachers[i].equals(Name)) {
                System.out.println(Name + " is already registered");
                return;
            }

        }
        Teachers[NumOfTeachers] = Name;
        NumOfTeachers++;

    }
    public void DropTeacher(String Name) {
        for (int i = 0; i < NumOfTeachers; i++) {
            if (Teachers[i].equals(Name)) {
                Teachers[i] = null;
                return;
            }
        }
        System.out.println("Teacher not found");

    }

    public void DisplayAllStudents() {
        if (NumOfStudents <= 0)
            System.out.println("No students");

        for (int i = 0; i < MaxStudents; i++) {
            if (Students[i] != null) {
                System.out.println(Students[i]);
            }
        }

    }
    public void DisplayAllTeachers() {
        if (NumOfTeachers <= 0)
            System.out.println("No teachers");

        for (int i = 0; i < MaxTeachers; i++) {
            if (Teachers[i] != null) {
                System.out.println(Teachers[i]);
            }
        }

    }

}
