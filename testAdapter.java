public class testAdapter {
        public static void main(String[] args){
        
        instructor myInstObj = new instructor();
        administrator myAdminObj = new administrator();
        accountPriv instAdapterObj = new instructorAdapter(myInstObj);
        student myStudentObj = new student();
        accountPriv studentAdapterObj = new studentAdapter(myStudentObj);
        
        myAdminObj.Registration();
        myAdminObj.deleteCourse();
        myAdminObj.updateCourse();
        
        myInstObj.cancelCourse();
        myInstObj.reassignCourse();
        myInstObj.uploadMaterial();
        
        instAdapterObj.Registration();
        instAdapterObj.deleteCourse();
        instAdapterObj.updateCourse();
        
        myStudentObj.addCourse();
        myStudentObj.dropCourse();
        myStudentObj.uploadHomework();
        
        studentAdapterObj.Registration();
        studentAdapterObj.deleteCourse();
        studentAdapterObj.updateCourse();
              
        }
        
}
