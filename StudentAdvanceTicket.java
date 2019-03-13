//represent student ticket purchased ahead of time
public class StudentAdvanceTicket extends AdvanceTicket {
	
	private int ticketNumber;
	public StudentAdvanceTicket(int daysInAdvance) {
		super(daysInAdvance);
		
		
	}
	
	public double getPrice() {
		return super.getPrice() /2;
	}
	
	@Override
	public String toString() {
		return "Number: " + ticketNumber + ", Price: " + this.getPrice();
	}
}

