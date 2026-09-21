package net.lecnam.ecue2.tp3;

public class Point {

    double longitude, latitude;

    public Point(double longitude, double latitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void translate(double x, double y) {
        this.longitude += x;
        this.latitude += y;
    }

    public boolean equals(Point p){
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        return (p.longitude == this.longitude && p.latitude == this.latitude);
    }

    public String toString(){
        return "Les coordonnées du point sont les suivant : \n    x : " + this.longitude + "\n    y : " + this.latitude;
    }

    public double retourneDistance(Point p){
        double x = p.longitude - this.longitude;
        double y = p.latitude - this.latitude;
        return Math.sqrt(x*x + y*y);
    }

}