package DemoOOPs;

public class Cylinder extends Circle {
    public double h;
    public Cylinder(){
        super();
        this.h = 10;
    }
    public Cylinder(double r, double h){
        super(r);
        this.h = h;
    }
    public double getVolume(){
        return super.getArea()*this.h;
    }
    public double getVolume(String name){
        System.out.println("This is Overloading Method: "+name);
        return super.getArea()*this.h;
    }

}
