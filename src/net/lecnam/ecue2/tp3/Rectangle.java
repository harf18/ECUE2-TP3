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

    public double retourneSurface() {
        return height * length;
    }

    public void translate(double x, double y) {
        origin.translate(x, y);
    }

    public boolean contain(Point ptn) {
        double x2 = origin.x + length;
        double y2 = origin.y + height;

        return (origin.x <= ptn.x) && (origin.y <= ptn.y) &&
                (ptn.x <= x2) && (ptn.y <= y2);
    }

    public boolean contain(Carre square) {
        double x2 = origin.x + length;
        double y2 = origin.y + height;

        double x2Square = square.origin.x + square.side;
        double y2Square = square.origin.y + square.side;

        return (origin.x <= square.origin.x) && (origin.y <= square.origin.y) &&
                (x2Square <= x2) && (y2Square <= y2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Rectangle rect = (Rectangle) o;
        return ((Double.compare(rect.height, height) == 0) &&
                ((Double.compare(rect.length, length) == 0)) &&
                (origin.equals(rect.origin)));
    }

    @Override
    public String toString()
    {
        return "(origin : " + origin + ", height : " + height + ", length : " + length + ", surface : " + retourneSurface() + ')';
    }
}
