
public class SubCmd implements ICommand {

	private String to;
	private int val;

	public SubCmd(String to, int val) {
		this.to = to;
		this.val=val;
	}

	public void execute(Mikrokontroler m) throws TooLongValueException {
		int actval = m.rejs.get(to).get();
		m.set(to, actval - val);			
	}
}
