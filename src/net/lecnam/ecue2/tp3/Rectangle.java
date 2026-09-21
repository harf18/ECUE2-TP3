package net.lecnam.ecue2.tp3;

public class Rectangle {
    double longueur,largeur;
    Point point;

    public Rectangle(Point point,double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.point = point;
    }

    public Rectangle(double x, double y, double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.point = new Point(x,y);
    }

    public double retourneSurface(){
        return longueur*largeur;
    }

    public void translate(double x, double y){
        this.point.translate(x,y);
    }
}
