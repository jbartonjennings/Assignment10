
public class WalkupTicket extends Ticket {
	
	private String ticketType;
	public WalkupTicket(int number) {
		//invoke the constructor of the super class
		super(number);
		ticketType = "Walkup";
		
	}
	@Override
	public double getPrice() {
		
		return 50.00;
	}
}
