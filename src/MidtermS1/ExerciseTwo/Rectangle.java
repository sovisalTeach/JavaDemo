package MidtermS1.ExerciseTwo;

public class Rectangle {
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }


}
