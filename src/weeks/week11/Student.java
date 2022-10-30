package weeks.week11;

public class Student {
    private String name;
    private String surname;
    private int id;
    private String email;

    public Student() {
        this("","",0,"");
        //this.name = "";
       // this.surname = "";
        //this.id = 0;
        //this.email = "";

    }

    public Student(String name, String surname, int id, String email) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print() {
        System.out.println("Name  : " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("ID  : " + this.id);
        System.out.println("Email : " + this.email);
        System.out.println();
    }
}
