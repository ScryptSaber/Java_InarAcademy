package chapters.chapter11.Exercise02;

import chapters.chapter10.Exercise14.MyDate;

public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate hiredDate;


    public Employee(String name, String address, String phoneNumber, String emailAddress, int office, double salary, MyDate hiredDate) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(MyDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\noffice: " + this.office +
                "\nsalary: " + this.salary +
                "\nhiredDate: " + this.hiredDate;
    }
}
