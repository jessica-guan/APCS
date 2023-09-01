/*
Implement class StudentAdvanceTicket to represent tickets purchased in advance by students.
A student advance ticket is constructed with a ticket number and with the number of
days in advance that the ticket was purchased. Student advance tickets cost half the
normal advance ticket price. A student advance ticket is printed with this format:
"Number: 17,Price: 15.0 (ID required)".
*/
public class StudentAdvanceTicket extends AdvanceTicket {
    
    private int studentID;
    
    public StudentAdvanceTicket(int ticketIDNumber, int daysInAdvance) {
        super(ticketIDNumber, daysInAdvance);
        super.price = super.getPrice() / 2;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    @Override
    public String toString() {
    	return ("Number: " + ticketIDNumber + ", Price: " + this.getPrice() + " (ID required)");
    }
    
}