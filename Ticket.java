// superclass for all tickets
public abstract class Ticket { //you cannot instantiate abstract classes
	
	//field
	private int number;
	//constructor
	public Ticket (int number) {
		//set the value of field to the argument passed to the constructor
		this.number = number;
	}
	public abstract double getPrice(); //abstract methods do not have implementation
										//therefore, the subclass is required to implement it
	
	//implement printing the object as a string by overriding toString method of the Object class
	
	@Override
	public String toString() {
		return "Number: " + this.number + ", Price: " + this.getPrice();
	}
}
