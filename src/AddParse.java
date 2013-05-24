
public class AddParse implements iParse {

	iParse next;
	public AddParse() {
		this.next = new AddParseRej();
	}
	
	public ICommand parse(String command) throws BadCommandException {
		if(command.startsWith("add ") && Converter.check(command)){
			String nazwa = Converter.rejestr(command);
			int wart = Converter.liczba(command);
			return new AddCmd(nazwa, wart);
		}
		return next.parse(command);
	}

}
