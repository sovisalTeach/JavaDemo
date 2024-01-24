package TaskNinth;

public class Teacher extends Person{
    private String course;

    public Teacher(String name, String address, String course) {
        super(name, address);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
