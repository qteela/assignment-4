package sif.geometry.circles.one;

public class Circle {
    private String id;
    private double radius;

    // Konstruktor tidak berargumen
    public Circle() {
        this.id = "";
        this.radius = 0;
    }

    // Konstruktor berargumen
    public Circle(String id, double radius) {
        this.id = id;
        this.radius = radius;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getters
    public String getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    // Menghitung luas lingkaran: π * r²
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Menghitung keliling lingkaran: 2 * π * r
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}