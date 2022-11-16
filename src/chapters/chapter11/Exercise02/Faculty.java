package chapters.chapter11.Exercise02;

import chapters.chapter10.Exercise14.MyDate;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;


    public Faculty(String name, String address, String phoneNumber, String emailAddress, int office, double salary, MyDate hiredDate, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "    _Faculty_   \n" + super.toString() +
                "\nofficeHours: '" + officeHours + '\'' +
                "\nrank: '" + rank + '\'';
    }
}
