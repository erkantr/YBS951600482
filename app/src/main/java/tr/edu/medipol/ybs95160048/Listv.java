package tr.edu.medipol.ybs95160048;

public class Listv {
    private String course;
    private int courseImage;

    public Listv(String course, int courseImage) {
        this.course = course;
        this.courseImage = courseImage;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(int courseImage) {
        this.courseImage = courseImage;
    }
}
