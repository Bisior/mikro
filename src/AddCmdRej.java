
public class AddCmdRej implements ICommand {

	private String to;
	private String from;

	public AddCmdRej(String to, String from) {
		this.to = to;
		this.from=from;
	}

	public void execute(Mikrokontroler m) throws TooLongValueException {
		int actval = m.rejs.get(to).get();
		int fromval = m.rejs.get(from).get();
		m.set(to, actval + fromval);			
	}
}
