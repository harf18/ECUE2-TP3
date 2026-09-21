package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longueur, largeur;
    Point p = new Point(0, 0);
    double longitude = p.longitude;
    double latitude = p.latitude;//Exercice 2

    public Rectangle(Point p, double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.longitude = p.longitude;
        this.latitude = p.latitude;
    }

    public Rectangle(double x, double y, double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
        this.longitude = x;
        this.latitude = y;
    } // Exercice 3

    public double retourneSurface(){
        return this.longueur * this.largeur;
    }

    public void translate(double x, double y){
        this.longitude += x;
        this.latitude += y;
    } //Exercice 4

    public boolean contient(Point p){
        return (p.longitude >= this.longitude && this.longitude + this.longueur >= p.longitude) && (p.latitude >= this.latitude && this.latitude + this.largeur >= p.latitude);
    } //Exercice 5

    public boolean equals(Rectangle r){
        if (this == r) return true;
        if (r == null || getClass() != r.getClass()) return false;
        return (r.longitude == this.longitude && r.latitude == this.latitude && r.longueur == this.longueur && r.largeur == this.largeur);
    }

    public String toString(){
        return "Les coordonnées du point sont les suivant : \n    x : " + this.longitude + "\n    y : " + this.latitude + "\nLes mesures du rectangles sont les suivantes :\n    longueur : " + this.longueur + "\n    largeur : " + this.largeur + "\n    surface : " + this.retourneSurface();
    } //Exercice 6

}
