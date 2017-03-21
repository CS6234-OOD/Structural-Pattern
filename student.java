package test;
public class student {
    
    public String addCourse(int courseNumber) {
        System.out.print("\n Student added course number " + courseNumber);
        return "Student added course number " + courseNumber;
    }
    
    public String dropCourse() {
        System.out.print("\n Student deleted course");
        return "Student dropped course";
    }
    
    public String uploadHomework(String courseName) {
        System.out.print("\n Student uploaded homework for " + courseName);
        return "Student uploaded homework for " + courseName;
    }
    
}
