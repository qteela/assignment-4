package sif.geometry.circles.one;

public class Circle {
    private String id;
    private double radius;

    public Circle() {
        this.id = "";
        this.radius = 0;
    }

    public Circle(String id, double radius) {
        this.id = id;
        this.radius = radius;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}