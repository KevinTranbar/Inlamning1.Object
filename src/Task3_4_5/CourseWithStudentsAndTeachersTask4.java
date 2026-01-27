package Task3_4_5;

public class CourseWithStudentsAndTeachersTask4 {

    CourseTask3 course2; //Initiate CourseTask3 class in this class to use CourseTask3 attributes and such (**CAN'T ASSIGN SOMETHING THAT HASN'T BEEN DECLARED***)

    public CourseWithStudentsAndTeachersTask4(String cCode, String cName, int maxNumOfStudents, int maxNumOfTeachers) { //Create course object with CourseTask3 class attributes
        this.course2 = new CourseTask3(cCode, cName, maxNumOfStudents, maxNumOfTeachers);

    }

    public void addStudentsTeachers() {
        course2.addStudent("Kevin", 1, "kev.tra@hot.se");
        course2.addStudent("Deja", 2, "dej.tod@hot.com");
        course2.addStudent("Neo", 3, "neo.joh@hot.se");
        course2.addStudent("Karl", 4, "kar.ung@yahoo.se");
        course2.addStudent("Bert", 5, "ber.dej@gmail.com");

        course2.addTeacher("Gustav", "Principle", "gus.prin@hot.se");
        course2.addTeacher("Benjamin", "Vice-principle", "ben.vic@gmail.com");

    }

    public void displayCourse() {
        System.out.println("In the course " + course2.getcCode()
                + " " + course2.getcName() + " are registered the following students: ");
        System.out.printf("%-4s %-18s %-20s %-30s%n", "No", "Name", "ID", "E-mail");
        course2.showRegisteredStudents();
        System.out.println();

        System.out.println("In the course " + course2.getcCode()
                + " " + course2.getcName() + " are involved the following teachers: ");
        System.out.printf("%-4s %-18s %-20s %-30s%n", "No", "Name", "Role", "E-mail");
        course2.showRegisteredTeachers();

    }

    public static void main(String[] args) {

        CourseWithStudentsAndTeachersTask4 course = new CourseWithStudentsAndTeachersTask4("1ik345", "Kurs1", 30, 5);

        course.addStudentsTeachers();
        course.displayCourse();

    }

}
