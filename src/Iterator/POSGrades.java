package Iterator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class POSGrades {
    public static void main(String[] args) throws Exception {
        Course mth121 = new Course("MTH", 121, "Calc I", "A");
        Course mth122 = new Course("MTH", 122, "Calc II", "B");
        Course cs101 = new Course("CS", 101, "CS 101", "C");
        Course cs102 = new Course("CS", 102, "CS 102", "D");
        Course cs140 = new Course("CS", 140, "CS 102");
        Course cs210 = new Course("CS", 210, "CS 104", "F");

        ProgramOfStudy pos = new ProgramOfStudy();
        pos.addCourse(mth121);
        pos.addCourse(mth122);
        pos.addCourse(cs101);
        pos.addCourse(cs102);
        pos.addCourse(cs140);
        pos.addCourse(cs210);

        pos.save("ProgramOfStudy");

        pos.load("ProgramOfStudy");

        for (Course course : pos) {
            if (!course.getGrade().equals(" ") && !course.getGrade().equals("F"))
                System.out.println(course);
        }

        System.out.println("Classes with Grades of C or D \n");

        for (Course course : pos) {
            if (course.getGrade().equals("C") || course.getGrade().equals("D"))
                System.out.println(course);
        }
    }
}
