
public class MovCmdRej implements ICommand {

	private String to;
	private String from;

	public MovCmdRej(String to, String from) {
		this.to = to;
		this.from=from;
	}

	public void execute(Mikrokontroler m) throws TooLongValueException {
			
		iRej rej = m.rejs.get(from);
		int val = rej.get();
		m.set(to, val);			
						
	}



}
