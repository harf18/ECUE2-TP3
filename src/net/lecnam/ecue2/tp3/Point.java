package net.lecnam.ecue2.tp3;

public class Point {
    private double x;
    private double y;

    public Point(double x , double y)
    {
        this.x = x;
        this.y = y;
    }
    public void translate(double x, double y)
    {
        this.x += x;
        this.y += y;
    }

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }

    @Override
    public boolean equals(Object p)
    {
        if(this == p)
        {
            return true;
        }
        if (!(p instanceof Point ))
        {
            return false;
        }

        Point autrePoint = (Point) p;
        return this.x == autrePoint.x && this.y == autrePoint.y;
    }
    @Override
    public String toString()
    {
        return "Point("+x+","+y+")";
    }

    public double retourneDistance(Point p)
    {
        double dx = this.x - p.x;
        double dy = this.y - p.y;

        return Math.sqrt(dx*dx + dy*dy);
    }
}
