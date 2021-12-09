package assignment6.q2;

import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class DrivingLicenseApplication extends Throwable{
    private LocalDate dataBirth;

    private int age;
    public DrivingLicenseApplication(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Your date of Birth as the following format: 01-30-2010");

        String string = myObj.nextLine();  // Read user input

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
//      System.out.println(date);
        this.dataBirth = date;

        LocalDate now = LocalDate.now();
        long elapsedDays = ChronoUnit.DAYS.between(now, date);
        int age = Math.abs((int) elapsedDays / 365);
        // get days between two dates
        this.age = age;
    }

    public void checkAge() throws MyException{
        // throw myException
        if(age < 16){
            throw new MyException("age is not legal");
        }
    }

    public int getAge() {
        return age;
    }
}
