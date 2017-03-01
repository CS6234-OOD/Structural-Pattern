
public class studentAdapter implements accountPriv {

    student theStudent;
    
    public studentAdapter(student newStudent){
        theStudent = newStudent;
    }
    
    @Override
    public void Registration() {
        theStudent.addCourse();
    }

    @Override
    public void deleteCourse() {
        theStudent.dropCourse();
    }

    @Override
    public void updateCourse() {
        theStudent.uploadHomework();
    }
   
}
