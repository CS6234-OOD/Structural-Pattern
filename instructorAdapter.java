package test;

public class instructorAdapter implements accountPriv {

    instructor theInstructor;
    
    public instructorAdapter(instructor newInstructor){
        theInstructor = newInstructor;
    }
    
    @Override
    public String Registration(int courseNumber) {
        return theInstructor.cancelCourse(courseNumber);       
    }

   
    @Override
    public String deleteCourse() {
        return theInstructor.reassignCourse();
    }

    @Override
    public String updateCourse(String courseName) {
        return theInstructor.uploadMaterial(courseName);
    }
   
}
