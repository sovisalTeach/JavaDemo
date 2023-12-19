package DemoOOPs;

public class Circle {
    public double r;
    public Circle(){
        this.r = 5;
    }
    public Circle(double r){
        this.r = r;
    }
    public Circle(double r, String name){
        this.r = r;
        System.out.println("Name of Circle: "+name);
    }
    public double getArea(){
        return Math.PI*r*r;
    }
}
