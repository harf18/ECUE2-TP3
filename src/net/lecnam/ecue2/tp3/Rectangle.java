package net.lecnam.ecue2.tp3;

import java.util.Objects;

public class Rectangle {

    double longueur, largeur;
    Point pointOrigine;

    /*Constructeur 1*/
    public Rectangle(Point p, double longueur, double largeur){
        this.pointOrigine = p;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /*Constructeur 2*/
    public Rectangle(double pointX, double pointY, double longueur, double largeur){
        this.pointOrigine = new Point(pointX,pointY);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /*Méthode qui retourne la surface du rectangle*/
    public double retourneSurface(){
        double surface = this.longueur * this.largeur;

        return surface;
    }

    /*Déplacer un rectangle (le point d'origine du rectangle)*/
    public void translate(double x, double y){
        this.pointOrigine.translate(x ,y);
    }

    /*Tester si un point se trouve dans le rectangle*/
    public boolean contient(Point p){
        double xMin = this.pointOrigine.x;
        double xMax = xMin + longueur;

        double yMin = this.pointOrigine.y;
        double yMax = yMin + largeur;

        boolean xDansRectangle = (p.x >= xMin && p.x <= xMax);
        boolean yDansRectangle = (p.y >= yMin && p.y <= yMax);

        return xDansRectangle && yDansRectangle;
    }

    /*Créer une égalité*/
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;

        boolean a = Objects.equals(pointOrigine, rectangle.pointOrigine);

        return Double.compare(longueur, rectangle.longueur) == 0 && Double.compare(largeur, rectangle.largeur) == 0 && Objects.equals(pointOrigine, rectangle.pointOrigine);
    }

    public String toString() {
        double s = retourneSurface();
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", pointOrigine=" + pointOrigine +
                ", surface=" + s +
                '}';
    }
}
