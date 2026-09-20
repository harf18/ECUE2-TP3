package net.lecnam.ecue2.tp3;

public class Dessin {
    private Object[] formes= new Object[10];
    private int nombreFormes = 0;
    public void ajout(Object forme)
    {
        formes [nombreFormes] = forme;
        nombreFormes++;
    }
    public double retourneSurface() {
        double surfaceTotale = 0;

        for (int i = 0; i < nombreFormes; i++) {

            if (formes[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) formes[i];
                surfaceTotale += rectangle.retourneSurface();

            } else if (formes[i] instanceof Carre) {
                Carre carre = (Carre) formes[i];
                surfaceTotale += carre.retourneSurface();
            }
        }

        return surfaceTotale;
    }
    public Carre retournePlusGrandCarre() {
        Carre plusGrand = null;

        for (int i = 0; i < nombreFormes; i++) {

            if (formes[i] instanceof Carre) {
                Carre carre = (Carre) formes[i];

                if (plusGrand == null
                        || carre.retourneSurface() > plusGrand.retourneSurface()) {
                    plusGrand = carre;
                }
            }
        }

        return plusGrand;
    }
    public Rectangle retournePlusGrandRectangle() {
        Rectangle plusGrand = null;

        for (int i = 0; i < nombreFormes; i++) {

            if (formes[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) formes[i];

                if (plusGrand == null
                        || rectangle.retourneSurface() > plusGrand.retourneSurface()) {
                    plusGrand = rectangle;
                }
            }
        }

        return plusGrand;
    }
    public void translate(double x, double y) {
        for (int i = 0; i < nombreFormes; i++) {

            if (formes[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) formes[i];
                rectangle.translate(x, y);

            } else if (formes[i] instanceof Carre) {
                Carre carre = (Carre) formes[i];
                carre.translate(x, y);
            }
        }
    }

}
