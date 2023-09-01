interface Vehicle {
    public void start();
    public void stop();
}
   
public class UML {
    public static void main(String[] args) { 
        Airplane airplane = new Airplane();
        airplane.start();
        Car car = new Car();
        car.speedup();
        Tesla tesla = new Tesla();
        tesla.selfdrive();
        Toyota toyota = new Toyota();
        toyota.gas();
        ModelS models = new ModelS();
        models.performace();
    } 
}