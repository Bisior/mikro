
public class AddParseRej implements iParse {

	iParse next;
	public AddParseRej() {
		this.next = new SubParse();
	}
	
	public ICommand parse(String command) throws BadCommandException {
		if(command.startsWith("add ")){
			String nazwa = Converter.rejestr(command);
			String nazwa2 = Converter.rejestrFrom(command);
			return new AddCmdRej(nazwa, nazwa2);
		}
		return next.parse(command);
	}

}
