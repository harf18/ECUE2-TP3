package net.lecnam.ecue2.tp3;

public class Exec  {

    public static void main(String[] args) {

        Point point = new Point(2.5, 3.5);

        System.out.println("Point créé : x = " + point.x + ", y = " + point.y);

        Point point2 = new Point(2.5, 3.5);
        Point point3 = new Point(1.0, 1.0);

        System.out.println("point.equals(point2) = " + point.equals(point2)); // true
        System.out.println("point.equals(point3) = " + point.equals(point3)); // false

        Point point4 = new Point(2.5, 3.5);
        System.out.println(point4); // affiche : Point(x=2.5, y=3.5)

        Point point5 = new Point(0, 0);
        Point point6 = new Point(3, 4);

        System.out.println(point5.retourneDistance(point6)); // affiche 5.0

    }

}
