

public class instructorAdapter implements accountPriv {

    instructor theInstructor;
    
    public instructorAdapter(instructor newInstructor){
        theInstructor = newInstructor;
    }
    
    @Override
    public void Registration(int courseNumber) {
        theInstructor.cancelCourse(courseNumber);       
    }

   
    @Override
    public void deleteCourse() {
        theInstructor.reassignCourse();
    }

    @Override
    public void updateCourse(String courseName) {
        theInstructor.uploadMaterial(courseName);
    }
   
}
