package net.lecnam.ecue2.tp3;

public class Dessin {

    Rectangle[] rectangles = new Rectangle[10];
    int nRectangles = 0;

    public void ajout(Rectangle rect)  {
        if (nRectangles == 10) {
            System.out.println("No more place");
            return;
        }
        rectangles[nRectangles] = rect;
        nRectangles++;
    }

    public double retourneSurface() {
        double totalSurface = 0.0;
        for (Rectangle rect: rectangles) {
            totalSurface += rect.retourneSurface();
        }
        return totalSurface;
    }

    public void translate(double x, double y) {
        for (Rectangle rect: rectangles) {
            rect.translate(x, y);
        }
    }

    public Rectangle retournePlusGrandRectangle() {
        Rectangle plusGrandRect = new Rectangle(0, 0, 0, 0);
        for (Rectangle rect: rectangles) {
            if (rect.retourneSurface() > plusGrandRect.retourneSurface()) {
                plusGrandRect = rect;
            }
        }
        return plusGrandRect;

    }
}

