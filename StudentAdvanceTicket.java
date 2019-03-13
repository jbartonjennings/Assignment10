
public class StudentAdvanceTicket extends Ticket
{
    private int days;
    public StudentAdvanceTicket(int number,int days)
    {
        super(number);
        this.days = days;
    }
    public double getPrice()
    {
        if(days>=10)
        return 15;
        else
        return 20;
    }
    public String toString()
    {
        return "Number : "+getNumber() +", Price : "+getPrice() +"(ID required)";
    }

}
