package Task3_4_5;

public class Teacher {

    //Attributes
    private String name;
    private String role;
    private String email;

    //Constructor
    public Teacher() {
        System.out.println("No teacher");

    }

    public Teacher(String name, String role, String email) {
        this.name = name;
        this.role = role;
        this.email = email;

    }

    //Getters
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    public String getEmail() {
        return email;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
