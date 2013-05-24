
public class Int33Cmd implements ICommand {

	public Int33Cmd() {

	}

	public void execute(final Mikrokontroler m) throws TooLongValueException {
		int funkcja = m.rejs.get("ah").get();
	
		switch (funkcja) {
	    
		case 1:
			m.set("ah", 0);
			m.set("el", 0);
	      break;
		
		case 2:
			m.set("ah", 0);
			m.set("el", 1);
	      break;
		
		case 3:
			m.set("ah", 0);
			m.set("eh", 1);
	      break;
	      
		case 4:
			m.set("ah", 0);
			m.set("eh", 2);
	      break;
	      
		case 5:
			m.set("ah", 0);
			m.clickLewyCounterPress=0;
			m.clickPrawyCounterPress=0;
			m.set("eh", 3);
			m.klawiszMyszy=m.rejs.get("bx").get();
	      break;  
	    
		case 6:
			m.set("ah", 0);
			m.clickLewyCounterPusc=0;
			m.clickPrawyCounterPusc=0;
			m.set("eh", 4);
			m.klawiszMyszy=m.rejs.get("bx").get();
	      break;   
	      
	          
	    default:
	    	m.set("ah", 0);
	      
	  }

	}

}
