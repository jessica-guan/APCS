public class Airplane implements Vehicle {
	String airline;
	String ID;
	int capacity;
    public void start() {
    	System.out.println("airplane is taking off...");
    }
    public void stop() {
    	System.out.println("airplane is landing...");
    }
}