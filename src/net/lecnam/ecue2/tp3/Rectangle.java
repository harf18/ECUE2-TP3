package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longueur;
    double largeur;
    Point origine;

    public Rectangle(Point origine, double longueur, double largeur) {
        this.origine = origine;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double x, double y, double longueur, double largeur) {
        this.origine = new Point(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double retourneSurface() {
        return longueur * largeur;
    }

    public void translate(double dx, double dy) {
        this.origine.x += dx;
        this.origine.y += dy;
    }

    public boolean contient(Point p) {
        return p.x >= origine.x && p.x <= origine.x + longueur &&
               p.y >= origine.y && p.y <= origine.y + largeur;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        return origine.equals(rect.origine) &&
               Double.compare(longueur, rect.longueur) == 0 &&
               Double.compare(largeur, rect.largeur) == 0;
    }

    public String toString() {
        return "Rectangle(origine=" + origine + ", longueur=" + longueur +
               ", largeur=" + largeur + ", surface=" + retourneSurface() + ")";
    }

}