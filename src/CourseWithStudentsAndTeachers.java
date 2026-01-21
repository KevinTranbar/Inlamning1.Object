public class CourseWithStudentsAndTeachers {

    //Attributes
    String Student1;
    String Student2;
    String Student3;
    String Student4;
    String Student5;

    String Teacher1;
    String Teacher2;

    String CourseCode;
    String CourseName;


    //Constructors
    public CourseWithStudentsAndTeachers(String CourseCode, String CourseName, String Student1, String Student2, String Student3,
    String Student4, String Student5, String Teacher1, String Teacher2) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;

        this.Student1 = Student1;
        this.Student2 = Student2;
        this.Student3 = Student3;
        this.Student4 = Student4;
        this.Student5 = Student5;

        this.Teacher1 = Teacher1;
        this.Teacher2 = Teacher2;

    }

    //Methods

    public void DisplayBeforeAfter () {

    }

}
