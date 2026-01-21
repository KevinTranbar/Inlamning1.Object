public class CourseWithStudentsAndTeachers {

    public static void main(String[] args) {

        Course course = new Course("1ik345", "Kurs1", 30);

        course.addStudent("Kevin");
        course.addStudent("Deja");
        course.addStudent("Neo");
        course.addStudent("Karl");
        course.addStudent("Bert");

        course.addTeacher("Gustav");
        course.addTeacher("Benjamin");

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

}
