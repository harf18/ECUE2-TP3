package net.lecnam.ecue2.tp3;


public class Point {

    // attributs
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // constructeur
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // méthode pour déplacer le point
    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    // comparer deux points
    @Override
    public boolean equals(Object p) {
        if (this == p) {
            return true;
        }

        if (!(p instanceof Point)) {
            return false;
        }

        Point point = (Point) p;

        return this.x == point.x && this.y == point.y;
    }

    // afficher le point
    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }

    // calculer la distance entre deux points
    public double retourneDistance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }
}

