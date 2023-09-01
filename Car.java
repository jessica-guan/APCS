public class Car implements Vehicle {
	String color;
	String brand;
	String licenseplate;
    public void start() {
        System.out.println("car is starting engine...");
    }
    public void stop() {
        System.out.println("car is stopping engine...");
    }
    public void turnleft() {
        System.out.println("car is turning left...");
    }
    public void turnright() {
        System.out.println("car is turning right...");
    }
    public void speedup() {
        System.out.println("car is speeding up...");
    }
    public void slowdown() {
        System.out.println("car is slowing down...");
    } 
}
