package test;

public class instructor  {

    public String cancelCourse(int courseNumber) {
        System.out.print("\n Instructor canceled course number " + courseNumber + "for today only");
        return "Instructor canceled course number " + courseNumber + " for today only";
    }
    
    public String reassignCourse() {
        System.out.print("\n Instructor changed");
        return "Instructor changed";
    }
    
    public String uploadMaterial(String courseName) {
        System.out.print("\n Instructor uploaded course material for " +  courseName);
        return "Instructor uploaded course material for " +  courseName;
    }
    

    
}

