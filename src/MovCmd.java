
public class MovCmd implements ICommand {

	private String to;
	private int val;

	public MovCmd(String to, int val) {
		this.to = to;
		this.val=val;
	}

	public void execute(Mikrokontroler m) throws TooLongValueException {
		
			m.set(to, val);			
	
	}
}
