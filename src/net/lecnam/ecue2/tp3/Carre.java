package net.lecnam.ecue2.tp3;

public class Carre {

    double longueur;
    Point p = new Point(0, 0);
    double longitude = p.longitude;
    double latitude = p.latitude;

    public Carre(Point p, double longueur){
        this.longueur = longueur;
        this.longitude = p.longitude;
        this.latitude = p.latitude;
    }

    public Carre(double x, double y, double longueur){
        this.longueur = longueur;
        this.longitude = x;
        this.latitude = y;
    }

    public double retourneSurface(){
        return this.longueur * this.longueur;
    }

    public void translate(double x, double y){
        this.longitude += x;
        this.latitude += y;
    }

    public boolean contient(Point p){
        return (p.longitude >= this.longitude && this.longitude + this.longueur >= p.longitude) && (p.latitude >= this.latitude && this.latitude + this.longueur >= p.latitude);
    }

    public boolean equals(Carre c){
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;
        return (c.longitude == this.longitude && c.latitude == this.latitude && c.longueur == this.longueur);
    }

    public String toString(){
        return "Les coordonnées du point sont les suivant : \n    x : " + this.longitude + "\n    y : " + this.latitude + "\nLes mesures du rectangles sont les suivantes :\n    longueur : " + this.longueur + "\n    largeur : " + this.longueur + "\n    surface : " + this.retourneSurface();
    }

}
