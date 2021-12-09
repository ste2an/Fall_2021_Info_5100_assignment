package assignment6.q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class test {
    public static void main(String[] args) {

        LocalDate JackBirth = LocalDate.of(1996, 8, 20);
        Student Jack = new Student(203311, "D.Jack", 76.77, JackBirth);

        LocalDate SaraBirth = LocalDate.of(1994, 2, 21);
        Student Sara = new Student(203554, "C.Sara", 84.45, SaraBirth);

        LocalDate TomBirth = LocalDate.of(1995, 6, 01);
        Student Tom = new Student(205512, "B.Tom", 92.11, TomBirth);

        LocalDate NickBirth = LocalDate.of(1995, 12, 11);
        Student Nick = new Student(206552, "A.Nick", 88.60, NickBirth);

        List<Student> list = new ArrayList<>();
        list.add(Jack);
        list.add(Sara);
        list.add(Tom);
        list.add(Nick);

        // NameComparator
        Collections.sort(list, (stu1, stu2) -> stu1.getName().compareTo(stu2.getName()));
        for (Student s: list) {
            System.out.println(s.getName());
        }

//        System.out.println("----------------------------------------");
//        list.sort((stu1, stu2) -> stu1.getId() - stu2.getId());
//        for (Student s: list) {
//            System.out.println(s.getName());
//        }

        System.out.println("----------------------------------------");
        // GpaComparator
        Collections.sort(list, (stu1, stu2) -> {
            return (int)(stu1.getGpa() - stu2.getGpa());
        });
        for (Student s: list) {
            System.out.println(s.getName() + " :" + s.getGpa());
        }

        // DateComparator
        System.out.println("----------------------------------------");
        Collections.sort(list, (stu1, stu2) -> stu1.getDateOfBirth().compareTo(stu2.getDateOfBirth()));
        for (Student s : list) {
            String d = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH).format(s.getDateOfBirth());
            System.out.println(s.getName() + " :" + d);
        }
    }
}
