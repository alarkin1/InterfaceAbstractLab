package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public String getPrerequisites() {
        return prerequisites;
    }

    //Ok
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

}
