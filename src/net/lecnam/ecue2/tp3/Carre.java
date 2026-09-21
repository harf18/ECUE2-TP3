package net.lecnam.ecue2.tp3;

public class Carre {


    // attributs
    private double longueur;
    private Point origine;
    private double x;
    private  double y ;


    // constructeur
    public Carre(double longueur, Point origine) {
        this.longueur = longueur;
        this.origine = origine;
    }
    // constructeur 2
    public Carre(double x, double y, double longueur) {
        this.origine = new Point(x, y);
        this.longueur = longueur;
    }

    public double RetournSurface(){
        return this.longueur * this.longueur;
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
                && p.getY() <= origine.getY() + longueur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Carre)) {
            return false;
        }

        Carre r = (Carre) obj;

        return this.origine.equals(r.origine)
                && this.longueur == r.longueur;
    }


}
