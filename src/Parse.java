
public class Parse implements iParse{

	//private static String[] slowas;


	iParse next;
	public Parse() {
		this.next = new MovParse();
	}

	public ICommand parse(String command) throws BadCommandException {
		return next.parse(command);
	}

}
