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
}

