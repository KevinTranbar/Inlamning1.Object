import java.util.Scanner;
import java.util.ArrayList;

public class CourseWithStudentsAndTeachers_Fel {

    //Attributes
    ArrayList<String> Students = new ArrayList<>();
    ArrayList<String> Teachers = new ArrayList<>();

    String CourseCode;
    String CourseName;


    //Constructors
    public CourseWithStudentsAndTeachers_Fel(String CourseCode, String CourseName) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;

    }

    //Methods
    public void DisplayBeforeAfter () {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter at least 5 students: ");
        String[] students = scanner.nextLine().split(",");

        System.out.println("Remove students: ");
        String[] removeStudents = scanner.nextLine().split(",");

        System.out.println("Enter at least 2 teachers: ");
        String[] teachers = scanner.nextLine().split(",");

        for (int i = 0; i < students.length; i++) {
            Students.add(students[i].trim());
        }
        for (int i = 0; i < teachers.length; i++) {
            Teachers.add(teachers[i].trim());
        }

        System.out.println();
        System.out.println("Students: ");
        System.out.println(Students);
        System.out.println();
        System.out.println("Teachers: ");
        System.out.println(Teachers);

        for (int i = 0; i < removeStudents.length; i++) {
            Students.remove(removeStudents[i]);
        }

        System.out.println();
        System.out.println("Students after removal: ");
        System.out.println(Students);

    }

}
