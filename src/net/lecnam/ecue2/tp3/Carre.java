package net.lecnam.ecue2.tp3;

public class Carre {
    private double cote;
    private Point origine;

    public Carre(Point origine, double cote) {
        this.origine = origine;
        this.cote = cote;
    }
    public Carre(double x, double y, double cote) {
        this.origine = new Point(x, y);
        this.cote = cote;
    }
    public double retourneSurface() {
        return cote * cote;
    }
    public void translate(double x, double y)
    {
        origine.translate(x, y);
    }
    public boolean contient(Point p)
    {
        return p.getX() >= origine.getX() && p.getX() <= origine.getX() + cote && p.getY() >= origine.getY() && p.getY() <= origine.getY() + cote;
    }
    @Override public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Carre))
        {
            return false;
        }
        Carre autreCarre = (Carre) obj;
        return origine.equals(autreCarre.origine) && cote == autreCarre.cote;
    }
    @Override public String toString()
    {
        return "Carre [origine=" + origine + ", cote=" + cote + ", surface=" + retourneSurface() + "]";
    }
    public Point getOrigine() {
        return origine;
    }

    public double getCote() {
        return cote;
    }

    public boolean contient(Rectangle rectangle) {

        Point origineRectangle = rectangle.getOrigine();

        Point coin1 = origineRectangle;

        Point coin2 = new Point(
                origineRectangle.getX() + rectangle.getLongueur(),
                origineRectangle.getY()
        );

        Point coin3 = new Point(
                origineRectangle.getX(),
                origineRectangle.getY() + rectangle.getLargeur()
        );

        Point coin4 = new Point(
                origineRectangle.getX() + rectangle.getLongueur(),
                origineRectangle.getY() + rectangle.getLargeur()
        );

        return contient(coin1)
                && contient(coin2)
                && contient(coin3)
                && contient(coin4);
    }

}
