import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      CourseTask3 course = new CourseTask3("ik232", "något", 7, 5);

      Student student1 = new Student("Kevin", 1, "Kev.Tra@hot.se");

      course.addStudent(student1);

      course.showRegisteredStudents();


      course.showRegisteredTeachers();


    }

}
