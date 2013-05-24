import java.util.Calendar;

import org.eclipse.swt.widgets.Display;

public class RunnableClock implements Runnable {

	private Mikrokontroler m;
	Display display;
		
    
	RunnableClock(Mikrokontroler m, Display display) {
		this.m = m;
		this.display = display;
	}
	
	public void run() {
		m.cal.add(Calendar.SECOND, 1);
		//System.out.println(String.valueOf(m.cal.get(Calendar.SECOND)));
		display.timerExec(1000, this);
	}

}
