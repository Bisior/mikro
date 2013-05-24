import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.events.MouseListener;


public class MyMouseListener implements MouseListener {

	Mikrokontroler m;
	Display display;
	
	public MyMouseListener(Parametry p, Display display) {
		this.m = p.m;
		this.display = display;
	}

	public void mouseDown(MouseEvent e) {
		Point cursor = display.getCursorLocation();
        if(e.button==1){
        	m.clickLewyCounterPress++;
        	try {
        		if(m.rejs.get("eh").get()==3 || m.rejs.get("eh").get()==4)
        			m.set("ax", 10);
        		if(m.rejs.get("eh").get()==1)
        			m.set("bx", 10);
			} catch (TooLongValueException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
        if(e.button==3){
        	m.clickPrawyCounterPress++;
        	try {
        		if(m.rejs.get("eh").get()==3 || m.rejs.get("eh").get()==4)
        			m.set("ax", 01);
        		if(m.rejs.get("eh").get()==1)
        			m.set("bx", 01);
			} catch (TooLongValueException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
		if(m.rejs.get("eh").get()==3 ){
        	try {
        		if((e.button==1 && m.klawiszMyszy==0)||(e.button==3 && m.klawiszMyszy==1)){
        			m.set("cx", cursor.x);
        			m.set("dx", cursor.y);
        		}
        	} catch (TooLongValueException e1) {
        		e1.printStackTrace();
        		}
        }	
	}

    public void mouseUp(MouseEvent e) {
    	Point cursor = display.getCursorLocation();
        if(e.button==1){
        	m.clickLewyCounterPusc++;
        }
        if(e.button==3){
        	m.clickPrawyCounterPusc++;
        }
        if(m.rejs.get("eh").get()==1){
        	try {
        		m.set("bx", 00);
        	} catch (TooLongValueException e1) {
        		e1.printStackTrace();
        		}
		}
        try {
    		if(m.rejs.get("eh").get()==3 || m.rejs.get("eh").get()==4)
    			m.set("ax", 00);
		} catch (TooLongValueException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(m.rejs.get("eh").get()==4){
        	try {
        		
        		if((e.button==1 && m.klawiszMyszy==0)||(e.button==3 && m.klawiszMyszy==1)){
        			m.set("cx", cursor.x);
        			m.set("dx", cursor.y);
        		}
        		
        	} catch (TooLongValueException e1) {
        		e1.printStackTrace();
        		}
		}
    }

    public void mouseDoubleClick(MouseEvent e) {
        //System.out.println("mouseDoubleClick");
    }

}
