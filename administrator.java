package test;
import java.util.Random;

public class administrator implements accountPriv {
    Random generator = new Random();

    @Override
    public String Registration(int courseNumber) {
        System.out.print("\n Admin closed registration for course" + courseNumber);
        return "Admin closed registration for course " + courseNumber;
    }

    @Override
    public String deleteCourse() {
        int confirmationNumber = generator.nextInt(10) + 1;
        System.out.print("\n Admin deleted course, confirmation number for transaction is: " + confirmationNumber);
        return "Admin deleted course, confirmation number for transaction is: " + confirmationNumber;
    }

    @Override
    public String updateCourse(String courseName) {
        System.out.print("\n Admin updated the course atributes for " + courseName);
        return "Admin updated the course atributes for " + courseName;
    }

    
}

