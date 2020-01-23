/**
 * This class +++Insert Description Here+++
 *
 * @author Junxiu Ma
 */
public class PartTimeStudent extends Student{
        
    private int numCourses;

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    public PartTimeStudent(String name, int numCourses){
        super(name);
        
    }

}
