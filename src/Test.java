import Task6.Desktop;
import Task6.Laptop;
import Task1_2.Course;

public class Test {

    public static void main(String[] args) {

        /*
        Desktop desktop1 = new Desktop(2, 8, 100, true, true, 500);
        Laptop laptop1 = new Laptop(2, 8, 120, true, false, 250, 30);

        double price = desktop1.calculatePrice();
        double price2 = laptop1.calculatePrice();

        System.out.println(price);
        System.out.println(price2);
         */

        Course course = new Course("ik321", "Prog", 2);
        course.addStudent("Kevin");
        course.addStudent("Deja");

        System.out.println(course.getcCode() + " " + course.getcName());
        course.showRegisteredStudents();






    }

}
