public class Course {

    //Attributes
    private String cCode;
    private String cName;
    private int maxNumOfStudents;
    private int maxNumOfTeachers;
    private String[] students;
    private String[] teachers;
    private int numOfRegStudents;
    private int numOfRegTeachers;

    //Constructors
    public Course() {
        System.out.println("No course selected");
        this.cCode = "";
        this.cName = "";
        this.maxNumOfStudents = 0;
        this.maxNumOfTeachers = 0;
        this.students = new String[0];
        this.teachers = new String[0];

    }

    public Course(String cCode, String cName, int maxNumOfStudents) {
        this.cCode = cCode;
        this.cName = cName;
        this.maxNumOfStudents = maxNumOfStudents;
        this.maxNumOfTeachers = 5;
        this.students = new String[maxNumOfStudents];
        this.teachers = new String[maxNumOfTeachers];

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
    public void addStudent(String student) {
        if (numOfRegStudents < maxNumOfStudents) {
            students[numOfRegStudents] = student;
            numOfRegStudents++;
        } else {
            System.out.println("Course full");
        }

    }
    public void addTeacher(String teacher) {
        if (numOfRegTeachers < maxNumOfTeachers) {
            teachers[numOfRegTeachers] = teacher;
            numOfRegTeachers++;
        } else {
            System.out.println("Teacher full");
        }

    }
    public void dropStudent(String student) {
        for (int i = 0; i < numOfRegStudents; i++) {
            if (students[i].equals(student)) {
                students[i] = null;
                for (int j = i; j < numOfRegStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numOfRegStudents - 1] = null;

                numOfRegStudents--;
            }
        }

    }
    public void dropTeacher(String teacher) {
        for (int i = 0; i < numOfRegTeachers; i++) {
            if (teachers[i].equals(teacher)) {
                teachers[i] = null;
                for (int j = i; j < numOfRegTeachers - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                teachers[numOfRegTeachers - 1] = null;

                numOfRegTeachers--;
            }
        }
    }
    public void showRegisteredStudents() {
        for (int i = 0; i < numOfRegStudents; i++) {
            System.out.println("  " + (i+1) + ". " + students[i]);
        }
    }
    public void showRegisteredTeachers() {
        for (int i = 0; i < numOfRegTeachers; i++) {
            System.out.println("  " + (i+1) + ". " + teachers[i]);
        }
    }

}
