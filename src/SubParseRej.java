
public class SubParseRej implements iParse {

	iParse next;
	public SubParseRej() {
		this.next = new Int1aParse();
	}
	
	public ICommand parse(String command) throws BadCommandException {
		if(command.startsWith("sub ")){
			String nazwa = Converter.rejestr(command);
			String nazwa2 = Converter.rejestrFrom(command);
			return new SubCmdRej(nazwa, nazwa2);
		}
		if(this.next == null){
			throw new BadCommandException();
		}
		return next.parse(command);
	}

}
