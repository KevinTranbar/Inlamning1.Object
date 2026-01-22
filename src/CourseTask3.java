public class CourseTask3 {

    //Attributes
    private String cCode;
    private String cName;
    private int maxNumOfStudents;
    private int maxNumOfTeachers;
    private Student[] students;
    private Teacher[] teachers;
    private int numOfRegStudents;
    private int numOfRegTeachers;

    //Constructors
    public CourseTask3() {
        System.out.println("No course selected");

    }

    public CourseTask3(String cCode, String cName, int maxNumOfStudents, int maxNumOfTeachers) {
        this.cCode = cCode;
        this.cName = cName;
        this.maxNumOfStudents = maxNumOfStudents;
        this.maxNumOfTeachers = maxNumOfTeachers;
        this.students = new Student[maxNumOfStudents];
        this.teachers = new Teacher[maxNumOfTeachers];

    }

    //Getters
    public String getcCode() {
        return cCode;
    }
    public String getcName() {
        return cName;
    }

    //Setters
    public void setcCode(String cCode) {
        this.cCode = cCode;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }

    //Methods
    public void addStudent(String name, int ID, String email) {
        if (numOfRegStudents < maxNumOfStudents) { //If possible, create student with Student method from Student class
            students[numOfRegStudents] = new Student(name, ID, email);
            numOfRegStudents++;
        } else {
            System.out.println("Students full");
        }


    }
    public void addTeacher(String name, String role, String email) {
        if (numOfRegTeachers < maxNumOfTeachers) {
            teachers[numOfRegTeachers] = new Teacher(name, role, email);
            numOfRegTeachers++;
        } else {
            System.out.println("Teacher full");
        }

    }

    public void showRegisteredStudents() {
        for (int i = 0; i < numOfRegStudents; i++) {
            System.out.printf("%-4d %-18s %-20s %-30s%n", i, students[i].getName(), students[i].getID(), students[i].getEmail());

        }
    }
    public void showRegisteredTeachers() {
        for (int i = 0; i < numOfRegTeachers; i++) {
            System.out.printf("%-4d %-18s %-20s %-30s%n", i, teachers[i].getName(), teachers[i].getRole(), teachers[i].getEmail());

        }
    }

}
