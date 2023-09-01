public class Point {
    int x;
    int y;
    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }
    public Point() {
        x = 0;
        y = 0;
    }
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setXY(int setX, int setY) {
        x = setX;
        y = setY;
    }
    public String toString() {
        return ("(" + x + ", " + y + ")");
    }
    public int getQuadrant() {
        if (x == 0 || y == 0) {
            return 0;
        }
        else if (x > 0) {
            if (y > 0) {
                return 1;
            }
            else {
                return 4;
            }
        }
        else {
            if (y > 0) {
                return 2;
            }
            else {
                return 3;
            }
        }
    }
    public double distanceToOrigin() {
        return (Math.sqrt(x * x + y * y));
    }
    public double slope(Point p) {
    	return ((y - 4.0) / (x - 137.0));
    }
}