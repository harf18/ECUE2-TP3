package net.lecnam.ecue2.tp3;

public class Dessin {

    Object[] rectangles = new Object[10];
    int nRectangles = 0;

    public void ajout(Object form)  {
        if ((!(form instanceof Rectangle)) && (!(form instanceof Carre)))  {
            return;
        }
        if (nRectangles == 10) {
            System.out.println("No more place");
            return;
        }
        rectangles[nRectangles] = form;
        nRectangles++;
    }

    public double retourneSurface() {
        double totalSurface = 0.0;
        for (int i = 0; i < nRectangles;i++) {
            if (rectangles[i] instanceof Rectangle) {
                totalSurface +=((Rectangle) rectangles[i]).retourneSurface();
            } else if (rectangles[i] instanceof Carre) {
                totalSurface +=((Carre) rectangles[i]).retourneSurface();
            }
        }
        return totalSurface;
    }

    public void translate(double x, double y) {
        for (int i = 0; i < nRectangles;i++) {
            if (rectangles[i] instanceof Rectangle) {
                ((Rectangle) rectangles[i]).translate(x, y);
            } else if (rectangles[i] instanceof Carre) {
                ((Carre) rectangles[i]).translate(x, y);
            }
        }
    }

    public Rectangle retournePlusGrandRectangle() {
        Rectangle plusGrandRect = new Rectangle(0, 0, 0, 0);
        for (int i = 0; i < nRectangles;i++) {
            if ((rectangles[i] instanceof Rectangle) && (((Rectangle) rectangles[i]).retourneSurface() > plusGrandRect.retourneSurface())) {
                plusGrandRect = (Rectangle) rectangles[i];
            }
        }
        return plusGrandRect;
    }

    public Carre retournePlusGrandCarre() {
        Carre plusGrandCarre = new Carre(0, 0, 0);
        for (int i = 0; i < nRectangles;i++) {
            if ((rectangles[i] instanceof Carre) && (((Carre) rectangles[i]).retourneSurface() > plusGrandCarre.retourneSurface())) {
                plusGrandCarre = (Carre) rectangles[i];
            }
        }
        return plusGrandCarre;
    }
}

