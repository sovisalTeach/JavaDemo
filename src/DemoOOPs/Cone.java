package DemoOOPs;

public class Cone extends Cylinder{
    public Cone(double r, double h){
        super(r,h);
    }
    @Override
    public double getVolume(){
        return super.getArea()*h/3;
    }
}
