package net.lecnam.ecue2.tp3;

public class Point {
    double x,y;

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    public void translate(double x, double y){
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean equals(Object p){
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Point point = (Point) p;
        return Double.compare(point.x, this.x) == 0 && Double.compare(point.y, this.y) == 0;
    }

    @Override
    public String toString(){
        return "x=" + this.x + ", y=" +this.y;
    }

    public double retourneDistance(Point p){
        return Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
    }
}
