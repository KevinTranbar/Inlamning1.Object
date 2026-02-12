import java.util.ArrayList;
import java.util.Scanner;

public class StudyProgram {

    private ArrayList<CourseTask3> courses = new ArrayList<>();
    private int maxNumOfStudents;
    private int numOfStudents;

    public void mainInterface() { //The start of the program

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Display courses and registered students");
        System.out.println("2. Create a course");
        System.out.println("3. Exit");
        String selection  = scanner.nextLine();
        switch (selection) {
            case "1" -> {
                displayCourses(); //Sent to displayCourses method
            }
            case "2" -> {
                createCourseSelection(); //Sent to createCoursesSelection method
            }
            case "3" -> { //Shut down
                System.out.println("Exiting the program...");
                System.exit(1);
            }
        }
        scanner.close();

    }

    public void displayCourses() { //Displays all past and present courses

        if (courses.isEmpty()) {
            System.out.println("No courses registered yet");
        } else {
            for (int i = 0; i < courses.size(); i++) { //Can be replaced with (CourseTask3 course : courses)
                CourseTask3 course = courses.get(i); //Get i index of arraylist courses
                System.out.println("In the course " + course.getcCode() + " " + course.getcName() + " are registered the following students: ");
                System.out.printf("%-4s %-18s %-20s %-30s%n", "No", "Name", "ID", "E-mail");
                course.showRegisteredStudents();
                System.out.println();
            }
        }

        mainInterface();

    }

    public void createCourseSelection() { //Creates course object and sends user to addStudent method

        Scanner scanner = new Scanner(System.in);

        System.out.println("Course Code: ");
        String courseCode = scanner.nextLine();
        System.out.println("Course Name: ");
        String courseName = scanner.nextLine();
        System.out.println("Max students: ");
        maxNumOfStudents = Integer.parseInt(scanner.nextLine());
        System.out.println("Max teachers: ");
        int maxTeachers = Integer.parseInt(scanner.nextLine());

        CourseTask3 course = new CourseTask3(courseCode, courseName, maxNumOfStudents, maxTeachers);

        courses.add(course);

        System.out.println("Add student?: Y/N");
        String selection = scanner.nextLine();
        if (selection.equalsIgnoreCase("Y")) {
            numOfStudents = 0; //Resets per course object
            addStudent(course); //Sent to addStudent method
        }

        scanner.close();
        mainInterface();

    }

    public void addStudent(CourseTask3 course) { //Adds student(s) to that instance of course

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("stop")) {
            mainInterface();
            return;
        }

        if (numOfStudents >= maxNumOfStudents) {
            System.out.println("Max students");
            return;
        }

        System.out.println("ID: ");
        int ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Email: ");
        String email = scanner.nextLine();

        course.addStudent(name, ID, email);
        numOfStudents++;

        scanner.close();
        addStudent(course);

    }

    public static void main(String[] args) {

        StudyProgram studyProgram = new StudyProgram();
        studyProgram.mainInterface();

    }

}
