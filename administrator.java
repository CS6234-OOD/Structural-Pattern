
public class administrator implements accountPriv {


    @Override
    public void Registration() {
        System.out.print("\n Admin closed registration");
    }

    @Override
    public void deleteCourse() {
        System.out.print("\n Admin deleted course");
    }

    @Override
    public void updateCourse() {
        System.out.print("\n Admin updated the course atributes");
    }

    
}
