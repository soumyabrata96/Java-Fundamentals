package com.fundamentals.abstractAndinterface;

abstract class Shape{
    private String color;
    public abstract double area();
    public abstract String toString();
    public String getColor(){
        return color;
    }
}
class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return String.format("Area of circle with radius %.2f is %.2f",radius,area());
    }
}
class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return String.format("Area of rectangle with length %.2f and width %.2f is %.2f",length,width,area());
    }
}
public class AbstractClassRunner {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(12.7,7.5);
        System.out.println(rectangle.toString());
        Circle circle=new Circle(5.0);
        System.out.println(circle.toString());
        Shape shape=new Shape(){

            final double height=7.8;
            final double base=5;
            @Override
            public double area() {
                return 0.5*base*height;
            }

            @Override
            public String toString() {
                return String.format("Area of triangle with base %.2f and height %.2f is %.2f",base,height,area());
            }
        };
        System.out.println(shape.toString());
    }

}
