package net.lecnam.ecue2.tp3;

public class Point {
    float x,y;

    public Point(){

    };
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    };

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Point translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        return this;
    };
}
