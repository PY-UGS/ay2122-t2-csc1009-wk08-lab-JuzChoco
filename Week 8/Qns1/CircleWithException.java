package Qns1;

import static java.lang.Math.*;

public class CircleWithException {
    private double radius;
    private double area;
    private double diameter;

    public CircleWithException(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area = PI * pow(radius, 2);
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

}