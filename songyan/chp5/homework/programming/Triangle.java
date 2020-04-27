package chp5.homework.programming;

public class Triangle extends GeometricObject {
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side) {
        this.side1 = side;
    }

    public void setSide2(double side) {
        this.side2 = side;
    }

    public void setSide3(double side) {
        this.side3 = side;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public double getArea() {
        double p;
        p = (this.side1 + this.side2 + this.side3) / 2.0;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    public String toString() {
        return "side1=" + this.side1 + ", side2=" + this.side2 + ", side3=" + this.side3 + ", area=" + this.getArea()
                + ", perimeter=" + this.getPerimeter();
    }

}