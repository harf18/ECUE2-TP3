package net.lecnam.ecue2.tp3;

public class Dessin {

    private Object[] formes;
    private int nombreFormes;

    public Dessin() {
        formes = new Object[10];
        nombreFormes = 0;
    }

    public void ajout(Exercice2.Rectangle rectangle) {
        if (nombreFormes < 10) {
            formes[nombreFormes] = rectangle;
            nombreFormes++;
        }
    }

    public void ajout(Carre carre) {
        if (nombreFormes < 10) {
            formes[nombreFormes] = carre;
            nombreFormes++;
        }
    }

    public double retourneSurface() {
        double surfaceTotale = 0;

        for (int i = 0; i < nombreFormes; i++) {

            if (formes[i] instanceof Exercice2.Rectangle) {
                Exercice2.Rectangle rectangle =
                        (Exercice2.Rectangle) formes[i];

                surfaceTotale += rectangle.Surface();

            } else if (formes[i] instanceof Carre) {
                Carre carre =
                        (Carre) formes[i];

                surfaceTotale += carre.Surface();
            }
        }

        return surfaceTotale;
    }

    public void translate(double x, double y) {
        for (int i = 0; i < nombreFormes; i++) {

            if (formes[i] instanceof Exercice2.Rectangle) {
                Exercice2.Rectangle rectangle =
                        (Exercice2.Rectangle) formes[i];

                rectangle.translate(x, y);

            } else if (formes[i] instanceof Carre) {
                Carre carre =
                        (Carre) formes[i];

                carre.translate(x, y);
            }
        }
    }

    public Exercice2.Rectangle retournePlusGrandRectangle() {

        Exercice2.Rectangle plusGrand = null;

        for (int i = 0; i < nombreFormes; i++) {

            if (formes[i] instanceof Exercice2.Rectangle) {

                Exercice2.Rectangle rectangle =
                        (Exercice2.Rectangle) formes[i];

                if (plusGrand == null
                        || rectangle.Surface() > plusGrand.Surface()) {
                    plusGrand = rectangle;
                }
            }
        }

        return plusGrand;
    }

    public Carre retournePlusGrandCarre() {

        Carre plusGrand = null;

        for (int i = 0; i < nombreFormes; i++) {

            if (formes[i] instanceof Carre) {

                Carre carre =
                        (Carre) formes[i];

                if (plusGrand == null
                        || carre.Surface() > plusGrand.Surface()) {
                    plusGrand = carre;
                }
            }
        }

        return plusGrand;
    }

    @Override
    public String toString() {
        String resultat = "";

        for (int i = 0; i < nombreFormes; i++) {
            resultat += formes[i] + "\n";
        }

        return resultat;
    }
}
