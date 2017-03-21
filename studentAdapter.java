package test;
public class studentAdapter implements accountPriv {

    student theStudent;
    
    public studentAdapter(student newStudent){
        theStudent = newStudent;
    }
    
    @Override
    public String Registration(int courseNumber) {
        return theStudent.addCourse(courseNumber);
    }

    @Override
    public String deleteCourse() {
        return theStudent.dropCourse();
    }

    @Override
    public String updateCourse(String courseName) {
        return theStudent.uploadHomework(courseName);
    }
   
}

