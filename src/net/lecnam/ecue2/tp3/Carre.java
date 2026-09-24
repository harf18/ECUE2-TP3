package net.lecnam.ecue2.tp3;

public class Carre {
    double side;
    Point origin;

    public Carre(Point ptn, double side) {
        origin = new Point(ptn.x, ptn.y);
        this.side = side;
    }

    public Carre(double x, double y, double side) {
        origin = new Point(x, y);
        this.side = side;
    }

    public double retourneSurface() {
        return side * side;
    }

    public void translate(double x, double y) {
        origin.translate(x, y);
    }

    public boolean contain(Point ptn) {
        double x2 = origin.x + side;
        double y2 = origin.y + side;

        return (origin.x <= ptn.x) && (origin.y <= ptn.y) &&
                (ptn.x <= x2) && (ptn.y <= y2);
    }

    public boolean contain(Rectangle rect) {
        double x2 = origin.x + side;
        double y2 = origin.y + side;

        double x2Square = rect.origin.x + rect.length;
        double y2Square = rect.origin.y + rect.height;

        return (origin.x <= rect.origin.x) && (origin.y <= rect.origin.y) &&
                (x2Square <= x2) && (y2Square <= y2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Carre square = (Carre) o;
        return ((Double.compare(square.side, side) == 0) &&
                (origin.equals(square.origin)));
    }

    @Override
    public String toString()
    {
        return "(origin : " + origin + ", side " + side + ", surface : " + retourneSurface() + ')';
    }
}
