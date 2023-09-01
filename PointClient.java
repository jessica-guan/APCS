import java.util.*;

public class PointClient {
    public static void main(String[] args) {
        System.out.println("mooDefault = (0, 0)");
        Scanner console = new Scanner(System.in);
        System.out.print("Enter x-value: ");
        int xValue = console.nextInt();
        System.out.print("Enter y-value: ");
        int yValue = console.nextInt();
        Point moo = new Point(xValue, yValue);
        System.out.print("moo = ");
        moo.toString();
        moo.translate(2, 2);
        moo.setXY(moo.getX(), 0);
        moo.translate(0, 19);
        moo.setXY(moo.getY(), moo.getX());
        moo.toString();
        Point other = new Point(137, 4);
        System.out.println("Quadrant: " + moo.getQuadrant());
        System.out.println("Distance to origin: " + moo.distanceToOrigin());
        System.out.println("slope = " + moo.slope(other));
        console.close();
    }
}