/*
Implement class WalkupTicket to represent a walk-up event ticket.
Walk-up tickets are also constructed by number, and they have a price of $50
*/

public class WalkupTicket extends Ticket {
	
	public WalkupTicket(int ticketIDNumber){
        super(ticketIDNumber);
        super.price = price;
    }
    
    @Override
    public String toString() {
        return ("Number: " + ticketIDNumber + ", Price: " + this.getPrice());
    }
    
}