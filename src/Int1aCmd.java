import java.util.Calendar;


public class Int1aCmd implements ICommand {

	public Int1aCmd() {

	}

	public void execute(Mikrokontroler m) throws TooLongValueException {
		int funkcja = m.rejs.get("ah").get();
		Calendar cal = m.cal;		
		switch (funkcja) {
	    
		case 2:
	    	m.set("ah", 0);
	    	m.set("ch", cal.get(Calendar.HOUR_OF_DAY ));
	    	m.set("cl", cal.get(Calendar.MINUTE));
	    	m.set("dh", cal.get(Calendar.SECOND));
	    	if(cal.get(Calendar.DST_OFFSET )!=0){
	    		m.set("dl", 1);
	    	}else{
	    		m.set("dl", 0);
	    	}
	      break;
	    
		case 3:
	    	m.set("ah", 0);
	    	cal.set(Calendar.HOUR_OF_DAY, m.rejs.get("ch").get());
	    	cal.set(Calendar.MINUTE, m.rejs.get("cl").get());
	    	cal.set(Calendar.SECOND, m.rejs.get("dh").get());
	    	cal.set(Calendar.DST_OFFSET, m.rejs.get("dl").get());
	      break;
	      
		case 4:
	    	m.set("ah", 0);
	    	m.set("ch", cal.get(Calendar.YEAR)/100);
	    	m.set("cl", cal.get(Calendar.YEAR)%100);
	    	m.set("dh", cal.get(Calendar.MONTH)+1);
	    	m.set("dl", cal.get(Calendar.DAY_OF_MONTH));
	      break;
	    
		case 5:
	    	m.set("ah", 0);
	    	cal.set(Calendar.YEAR, m.rejs.get("ch").get()*100 + m.rejs.get("cl").get());
	    	cal.set(Calendar.MONTH, m.rejs.get("dh").get()-1);
	    	cal.set(Calendar.DAY_OF_MONTH, m.rejs.get("dl").get());
	      break;
	 
	    default:
	    	m.set("ah", 0);
	      
	  }

	}

}
