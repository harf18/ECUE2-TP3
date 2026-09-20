package net.lecnam.ecue2.tp3;

public class Rectangle {
    private double longueur;
    private double largeur;
    private Point origine;

    public Rectangle(Point origine, double longueur, double largeur)
    {
        this.origine = origine;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double x, double y, double longueur, double largeur )
    {
        this.origine = new Point(x,y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double retourneSurface()
    {
        return longueur * largeur;
    }

    public void translate(double x, double y)
    {
        origine.translate(x,y);
    }
    public boolean contient(Point p)
    {
        return p.getX() >= origine.getX() && p.getX() <= origine.getX() + longueur && p.getY() >= origine.getY() && p.getY() <= origine.getY() + largeur;
    }
    @Override public boolean equals(Object obj)
    {
        if (this == obj) { return true; } if (!(obj instanceof Rectangle)) { return false; } Rectangle autreRectangle = (Rectangle) obj; return origine.equals(autreRectangle.origine) && longueur == autreRectangle.longueur && largeur == autreRectangle.largeur;
    }
    @Override public String toString()
    {
        return "Rectangle [origine=" + origine + ", longueur=" + longueur + ", largeur=" + largeur + ", surface=" + retourneSurface() + "]";
    }

    public boolean contient(Carre carre) {
        Point origineCarre = carre.getOrigine();

        Point coin1 = origineCarre;
        Point coin2 = new Point(
                origineCarre.getX() + carre.getCote(),
                origineCarre.getY()
        );
        Point coin3 = new Point(
                origineCarre.getX(),
                origineCarre.getY() + carre.getCote()
        );
        Point coin4 = new Point(
                origineCarre.getX() + carre.getCote(),
                origineCarre.getY() + carre.getCote()
        );

        return contient(coin1)
                && contient(coin2)
                && contient(coin3)
                && contient(coin4);
    }

    public Point getOrigine() {
        return origine;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }





}
