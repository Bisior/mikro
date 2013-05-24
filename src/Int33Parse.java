
public class Int33Parse implements iParse {

	iParse next;
	public Int33Parse() {
		this.next = null;
	}
	
	public ICommand parse(String command) throws BadCommandException {
		if(command.startsWith("int ") && command.endsWith("33h")){
			return new Int33Cmd();
		}
		if(this.next == null){
			throw new BadCommandException();
		}
		return next.parse(command);
	}

}
