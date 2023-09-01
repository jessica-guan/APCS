/*
Implement class AdvanceTicket to represent tickets purchased in advance.
An advance ticket is constructed with a ticket number and with the number of days
in advance that the ticket was purchased. Advance tickets purchased 10 or more
days before the event cost $30, and advance tickets purchased fewer than 10 days
before the event cost $40.
*/
public class AdvanceTicket extends Ticket {
    
	protected int daysInAdvance;
	private static final int TEN_DAYS_OR_LESS = 10;  // Denotes that 10 days is the max for the smaller discount
	private static final int LAST_DAY_ADVANCE = 1;   // Denotes 1 days is the minimum for the smaller discount
	                                                    
	    
	public AdvanceTicket(int ticketIDNumber, int daysInAdvance) {
		super(ticketIDNumber);
	    if (daysInAdvance >= TEN_DAYS_OR_LESS) {
	    	super.price = price - 20.0;
	    } else if (daysInAdvance < TEN_DAYS_OR_LESS && daysInAdvance >= LAST_DAY_ADVANCE) {
	        super.price = price - 10.0;
	    } else {
	        super.price = price;
	    }
	}

	@Override
	public double getPrice() {
		return super.price;
	}
	    
	public String toString() {
		return ("Number: " + ticketIDNumber + ", Price: " + this.getPrice());
	}
    
}