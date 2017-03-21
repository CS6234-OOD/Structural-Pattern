package test;
public class testAdapter {
        public static void main(String[] args){
        
        instructor myInstObj = new instructor();
        administrator myAdminObj = new administrator();
        accountPriv instAdapterObj = new instructorAdapter(myInstObj);
        student myStudentObj = new student();
        accountPriv studentAdapterObj = new studentAdapter(myStudentObj);
        
        // test admin
        myAdminObj.Registration(123);
        myAdminObj.deleteCourse();
        myAdminObj.updateCourse("OOD");
        
        //test instructor
        myInstObj.cancelCourse(234);
        myInstObj.reassignCourse();
        myInstObj.uploadMaterial("Big Data");
        
        //test instructor with adapter
        instAdapterObj.Registration(234);
        instAdapterObj.deleteCourse();
        instAdapterObj.updateCourse("Big Data");
        
        //test student
        myStudentObj.addCourse(987);
        myStudentObj.dropCourse();
        myStudentObj.uploadHomework("Algorithms");
        
        //test student with adapter
        studentAdapterObj.Registration(987);
        studentAdapterObj.deleteCourse();
        studentAdapterObj.updateCourse("Algorithms");
              
        }
        
}
