
public class MovParse implements iParse {
	iParse next;
	public MovParse() {
		this.next = new MovParseRej();
	}

	public ICommand parse(String command) throws BadCommandException {
		if(command.startsWith("mov ") && Converter.check(command)){
			String nazwa = Converter.rejestr(command);
			int wart = Converter.liczba(command);
			return new MovCmd(nazwa, wart);
		}
		return next.parse(command);
	}
}
