package assignment6.q2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class test {
    public static void main(String[] args) {
        DrivingLicenseApplication d = new DrivingLicenseApplication();
        try {
            d.checkAge();
            // may throw an MyException exception
        }catch (MyException e){
            // once the MyException exception is caught
            System.out.println("the age of the applicant is " + d.getAge() + " which is too early to apply for a driving licences");
        }
    }
}
