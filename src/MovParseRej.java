
public class MovParseRej implements iParse {
	iParse next;
	public MovParseRej() {
		this.next = new AddParse();
	}

	public ICommand parse(String command) throws BadCommandException {
		if(command.startsWith("mov ")){
			String nazwa = Converter.rejestr(command);
			String nazwa2 = Converter.rejestrFrom(command);
			return new MovCmdRej(nazwa, nazwa2);
		}
		return next.parse(command);
	}
}
