package net.lecnam.ecue2.tp3;

public class Rectangle {
    double height;
    double length;
    Point origin;

    public Rectangle(Point ptn, double height, double length) {
        origin = new Point(ptn.x, ptn.y);
        this.height = height;
        this. length = length;
    }

    public Rectangle(double x, double y, double height, double length) {
        origin = new Point(x, y);
        this.height = height;
        this.length = length;
    }
}
