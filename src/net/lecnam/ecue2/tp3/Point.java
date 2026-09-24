package net.lecnam.ecue2.tp3;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double addX, double addY) {
        x += addX;
        y += addY;
    }

    public double retourneDistance(Point ptn) {
        return Math.sqrt(Math.pow(x - ptn.x, 2) + Math.pow(y - ptn.y, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Point ptn = (Point) o;
        return ((Double.compare(ptn.x, x) == 0) &&
                ((Double.compare(ptn.y, y) == 0)));
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
