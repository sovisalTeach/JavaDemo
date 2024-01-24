import TaskNinth.Student;

public class Main {
    public static void main(String[] args) {
        // name and address => Person
        // numCourse, course, grade
        // method => addCourseGrade(course, grade)
        // method => printGrade()
        Student obj = new Student("Sovisal","Phnom Penh",5);
        try{
            obj.addCourseGrade("Java",100);
            obj.addCourseGrade("Network",90);
            obj.addCourseGrade("STA",100);
            obj.addCourseGrade("C#",100);
            obj.addCourseGrade("MIS",80);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("\n================================");
        obj.printGrade();
    }
}