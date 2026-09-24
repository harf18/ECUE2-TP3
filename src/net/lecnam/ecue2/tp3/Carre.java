package net.lecnam.ecue2.tp3;

public class Carre {

    double longueur;
    double x;
    double y;

    public Carre(Exercice1.Point Point, double longueur) {
        this.x = Point.pointLongitude;
        this.y = Point.pointLatitude;
        this.longueur = longueur;
    }

    public double Surface() {
        return this.longueur * this.longueur;
    }

    void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    boolean contient(Exercice1.Point p) {
        if ((this.x - this.longueur) < p.pointLongitude
                && p.pointLongitude < this.x
                && this.y < p.pointLatitude
                && p.pointLatitude < (this.y + this.longueur)) {
            return true;
        } else {
            return false;
        }
    }

    boolean equals(Carre c) {
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;

        Carre carre = (Carre) c;

        return Double.compare(carre.x, x) == 0
                && Double.compare(carre.y, y) == 0
                && Double.compare(carre.longueur, longueur) == 0;
    }

    public String toString() {
        return "Le carré de côté " + this.longueur
                + " a une surface de " + Surface();
    }
}

