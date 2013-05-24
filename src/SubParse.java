
public class SubParse implements iParse {

	iParse next;
	public SubParse() {
		this.next = new SubParseRej();
	}
	
	public ICommand parse(String command) throws BadCommandException {
		if(command.startsWith("sub ") && Converter.check(command)){
			String nazwa = Converter.rejestr(command);
			int wart = Converter.liczba(command);
			return new SubCmd(nazwa, wart);
		}
		return next.parse(command);
	}

}
