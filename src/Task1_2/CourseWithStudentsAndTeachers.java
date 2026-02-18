package Task1_2;

public class CourseWithStudentsAndTeachers {

    Course course; //Declare Course in this class to use Course attributes and such

    public CourseWithStudentsAndTeachers(String cCode, String cName, int maxNumOfStudents) { //Create course object with Course class attributes
        this.course = new Course(cCode, cName, maxNumOfStudents);
    }

    public void addStudentsTeachers() { //Add students and teachers to course object
        course.addStudent("Kevin");
        course.addStudent("Deja");
        course.addStudent("Neo");
        course.addStudent("Karl");
        course.addStudent("Bert");

        course.addTeacher("Gustav");
        course.addTeacher("Benjamin");

    }

    public void displayCourse() {
        System.out.println("List of students registered in the course " + course.getcCode() + " " + course.getcName() + ": ");
        course.showRegisteredStudents();
        System.out.println();
        System.out.println("List of teachers involved in the course " + course.getcCode() + " " + course.getcName() + ": ");
        course.showRegisteredTeachers();
        System.out.println();

        course.dropStudent("Karl");

        System.out.println("List of remaining students in the course " + course.getcCode() + " " + course.getcName() + " after removing a student: ");
        course.showRegisteredStudents();

    }

    public static void main(String[] args) {

        CourseWithStudentsAndTeachers course = new CourseWithStudentsAndTeachers("1ik345", "Kurs1", 30);

        course.addStudentsTeachers();
        course.displayCourse();

    }

}
