package net.lecnam.ecue2.tp3;

public class Rectangle {
    double longueur, largeur;
    Point point;

    public Rectangle(Point point, double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.point = point;
    }

    public Rectangle(double x, double y, double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.point = new Point(x, y);
    }

    public double retourneSurface() {
        return longueur * largeur;
    }

    public void translate(double x, double y) {
        this.point.translate(x, y);
    }

    public boolean contient(Point point) {
        return (point.x >= this.point.x && point.x <= (this.longueur+this.point.x)) && (point.y >= this.point.y && point.y <= (this.largeur+this.point.y));
    }

    @Override
    public boolean equals(Object r){
        if (this == r) return true;
        if (r == null || getClass() != r.getClass()) return false;
        Rectangle rectangle = (Rectangle) r;
        return rectangle.point.equals(this.point) && Double.compare(rectangle.largeur, this.largeur) == 0 && Double.compare(rectangle.longueur, this.longueur) == 0;
    }

    @Override
    public String toString(){
        return "Point d'origine : " + point.toString() + "; longueur = " + longueur + "; largeur = " + largeur + ", Surface = " + this.retourneSurface();
    }

}