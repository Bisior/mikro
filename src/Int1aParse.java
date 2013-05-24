
public class Int1aParse implements iParse {

	iParse next;
	public Int1aParse() {
		this.next = new Int33Parse();
	}
	
	public ICommand parse(String command) throws BadCommandException {
		if(command.startsWith("int ") && command.endsWith("1ah")){
			return new Int1aCmd();
		}
		if(this.next == null){
			throw new BadCommandException();
		}
		return next.parse(command);
	}

}
