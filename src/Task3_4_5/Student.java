package Task3_4_5;

public class Student {

    //Attributes
    private String name;
    private int ID;
    private String email;

    //Constructor
    public Student() {
        System.out.println("No student");

    }

    public Student(String name, int ID, String email) {
        this.name = name;
        this.ID = ID;
        this.email = email;

    }

    //Getters
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public String getEmail() {
        return email;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
