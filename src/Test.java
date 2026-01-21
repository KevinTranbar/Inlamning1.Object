public class Test {

    public static void main(String[] args) {

        Course course = new Course("ik231", "Programing", 3, 4);
        Course course2 = new Course("ik231", "Programing", 3, 4);

        course.AddStudent("Kevin");
        course.AddStudent("Deja");
        course.AddStudent("Neo");
        course.DropStudent("Hej");

        course.AddTeacher("Deja");
        course.AddTeacher("Neo");
        course.AddTeacher("hej");
        course.AddTeacher("hej");

        int i = course.GetNumOfStudents();
        System.out.println(i);



    }

}
