
public class AddCmd implements ICommand {

	private String to;
	private int val;

	public AddCmd(String to, int val) {
		this.to = to;
		this.val=val;
	}

	public void execute(Mikrokontroler m) throws TooLongValueException {
		int actval = m.rejs.get(to).get();
		m.set(to, actval + val);			
	}
}
