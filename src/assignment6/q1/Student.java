package assignment6.q1;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private LocalDate dateOfBirth;

    public Student(int id, String name, double gpa, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


}
