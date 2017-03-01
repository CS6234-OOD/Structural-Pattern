
public class instructorAdapter implements accountPriv {

    instructor theInstructor;
    
    public instructorAdapter(instructor newInstructor){
        theInstructor = newInstructor;
    }
    
    @Override
    public void Registration() {
        theInstructor.cancelCourse();
    }

    @Override
    public void deleteCourse() {
        theInstructor.reassignCourse();
    }

    @Override
    public void updateCourse() {
        theInstructor.uploadMaterial();
    }
   
}
