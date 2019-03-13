
public class AdvanceTicket extends Ticket {
	
	private int daysInAdvance;
	public AdvanceTicket(int number, int daysInAdvance ){
		super (number);
		this.daysInAdvance = daysInAdvance;
	}
	
	@Override
	public double getPrice() {
		//TODO Auto-generated method stub
		if(daysInAdvance >= 10) {
			return 30.0;
		}
		else {
			return 0;
	}
}
	
}
