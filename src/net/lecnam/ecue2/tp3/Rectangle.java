package net.lecnam.ecue2.tp3;

public class Rectangle {



    // attributs
    private double longueur;
    private double largeur;
    private Point origine;
    private double x;
    private  double y ;


    // constructeur
    public Rectangle(double longueur, double largeur, Point origine) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.origine = origine;
    }
    // constructeur 2
    public Rectangle(double x, double y, double longueur, double largeur) {
        this.origine = new Point(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double RetournSurface(){
        return this.longueur * this.largeur;
    }

    //public  void translate(double x, double y ){
        //this.x += x;
        //this.y += y;
    //}
    public void translate(double x, double y) {
        origine.translate(x, y);
    }





    public boolean contient(Point p) {
        return p.getX() >= origine.getX()
                && p.getX() <= origine.getX() + longueur
                && p.getY() >= origine.getY()
                && p.getY() <= origine.getY() + largeur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle r = (Rectangle) obj;

        return this.origine.equals(r.origine)
                && this.longueur == r.longueur
                && this.largeur == r.largeur;
    }





}
