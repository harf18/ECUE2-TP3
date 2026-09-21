package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longueur1;
    double largeur;
    Point origine;

    // Exercice 3 : constructeur avec un Point
    public Rectangle(Point origine, double longueur1, double largeur) {
        this.origine = origine;
        this.longueur1 = longueur1;
        this.largeur = largeur;
    }

    // Exercice 3 : constructeur avec les coordonnées du Point
    public Rectangle(double x, double y, double longueur1, double largeur) {
        this.origine = new Point(x, y);
        this.longueur1 = longueur1;
        this.largeur = largeur;
    }

    // Exercice 4 : retourne la surface du rectangle
    public double retourneSurface() {
        return longueur1 * largeur;
    }

    // Exercice 4 : déplace le rectangle
    public void translate(double x, double y) {
        origine.translate(x, y);
    }

    // Exercice 5 : vérifie si un Point est dans le rectangle
    public boolean contient(Point point) {
        return point.x >= origine.x
                && point.x <= origine.x + longueur1
                && point.y >= origine.y
                && point.y <= origine.y + largeur;
    }

    // Exercice 6 : compare deux rectangles
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle rectangle = (Rectangle) obj;

        return origine.equals(rectangle.origine)
                && longueur1 == rectangle.longueur1
                && largeur == rectangle.largeur;
    }

    // Exercice 6 : affiche les informations du rectangle
    @Override
    public String toString() {
        return "Rectangle : origine=" + origine
                + ", longueur1=" + longueur1
                + ", largeur=" + largeur
                + ", surface=" + retourneSurface();
    }
}