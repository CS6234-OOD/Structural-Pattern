
import java.util.Random;

public class administrator implements accountPriv {
    Random generator = new Random();

    @Override
    public void Registration(int courseNumber) {
        System.out.print("\n Admin closed registration for course" + courseNumber);
        
    }

    @Override
    public void deleteCourse() {
        int confirmationNumber = generator.nextInt(10) + 1;
        System.out.print("\n Admin deleted course, confirmation number for transaction is: " + confirmationNumber);
    }

    @Override
    public void updateCourse(String courseName) {
        System.out.print("\n Admin updated the course atributes for " + courseName);
        
    }

    
}

