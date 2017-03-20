

public class studentAdapter implements accountPriv {

    student theStudent;
    
    public studentAdapter(student newStudent){
        theStudent = newStudent;
    }
    
    @Override
    public void Registration(int courseNumber) {
        theStudent.addCourse(courseNumber);
    }

    @Override
    public void deleteCourse() {
        theStudent.dropCourse();
    }

    @Override
    public void updateCourse(String courseName) {
        theStudent.uploadHomework(courseName);
    }
   
}

