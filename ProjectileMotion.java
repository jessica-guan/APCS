import java.util.*;
import java.awt.*;

public class ProjectileMotion {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter the start angle in degrees:  ");
		double angle1 = Math.toRadians(console.nextDouble());
		System.out.print("Please enter the final angle in degrees:  ");
		double angle2 = Math.toRadians(console.nextDouble());
		System.out.print("Please enter the step size in degrees:    ");
		double steps = console.nextDouble();
		DrawingPanel panel = new DrawingPanel (1000, 600);
		Graphics g = panel.getGraphics ();
		double acceleration = -9.81;
		double velocity = 30;
		ArrayList<Color> colorOval = new ArrayList<Color>();
		colorOval.add(Color.BLACK);
		colorOval.add(Color.BLUE);
		colorOval.add(Color.RED);
		colorOval.add(Color.MAGENTA);
		colorOval.add(Color.PINK);
		colorOval.add(Color.ORANGE);
		g.drawLine(50, 525, 975, 525);
		g.drawLine(50, 100, 50, 525);
		g.drawString("distance", 500, 570);
		g.drawString("h", 20, 300);
		g.drawString("e", 20, 310);
		g.drawString("i", 20, 320);
		g.drawString("g", 20, 330);
		g.drawString("h", 20, 340);
		g.drawString("t", 20, 350);
		for (int n = 3; n <= 38; n++) {
			g.drawLine(n * 25, 520, n * 25, 530);
		}
		for (int n = 5; n <= 20; n++) {
			g.drawLine(45, n * 25, 55, n * 25);
		}
		int i = 0;
		while (angle1 <= angle2) {
			g.setColor(colorOval.get(i % 6));
			double step = 100;
			double xVelocity = velocity * Math.cos(angle1);
			double yVelocity = velocity * Math.sin(angle1);
			double time = -1 * 2 * yVelocity / acceleration;
			double timeIncrement = time / step;
			double xIncrement = xVelocity * timeIncrement;
			double x = 0.0;
			double y = 0.0;
			double t = 0.0;
			for (int n = 1; n <= step; n++) {
				t += timeIncrement;
				x += xIncrement * 10;
				y = (yVelocity * t + 0.5 * acceleration * t * t) * 10;
				g.fillOval((int) ((Math.round(x)) + 50), (int) ((525 - Math.round(y))), 2, 2);
				if (n == 30) {
					String text = Math.round(Math.toDegrees(angle1)) + "°";
					g.drawString(text, (int) ((Math.round(x)) + 50), (int) ((525 - Math.round(y))));
				}
			}
			angle1 += Math.toRadians(steps);
			i++;
		}
		g.setColor(Color.BLACK);
		Font currentFont = g.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 2.5F);
		g.setFont(newFont);
		g.drawString("Projectile Motion", 400, 50);
		console.close();
	}
}
	