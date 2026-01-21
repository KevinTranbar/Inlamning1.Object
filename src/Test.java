public class Test {

    public static void main(String[] args) {

        Course course = new Course("ik231", "Programing", 3, 4);

        course.AddStudent("Kevin");
        course.AddStudent("Deja");
        course.AddStudent("Neo");

        course.AddTeacher("Deja");
        course.AddTeacher("Neo");
        course.AddTeacher("hej");
        course.AddTeacher("hej");


        System.out.println("Students: ");
        course.DisplayAllStudents();
        System.out.println("Teachers: ");
        course.DisplayAllTeachers();



    }

}
