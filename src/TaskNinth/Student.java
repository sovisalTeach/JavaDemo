package TaskNinth;

public class Student extends Person{
    private int numCourse;
    private String[] course;
    private int[] grade;
    private int temp = 0;

    public Student(String name, String address, int numCourse) {
        super(name, address);
        this.numCourse = numCourse;
        this.course = new String[this.numCourse];
        this.grade = new int[this.numCourse];
    }
    public void addCourseGrade(String course, int grade) throws ArrayIndexOutOfBoundsException{
        if(this.course.length!=this.numCourse-1){
            this.course[temp]=course;
            this.grade[temp]=grade;
            temp++;
        }else {
            throw new ArrayIndexOutOfBoundsException("You cannot input more Course and Grade than Number of Course that you have inputed!");
        }
    }
    public void printGrade(){
        for(int i=0; i<this.course.length; i++){
            System.out.println("Course: "+this.course[i]+" Grade: "+this.grade[i]);
        }
    }
}
