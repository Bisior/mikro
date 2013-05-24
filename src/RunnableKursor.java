
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class RunnableKursor implements Runnable {

	private Mikrokontroler m;
	Label labelAx;
	Label labelAh;
	Label labelAl;
	Label labelBx;
	Label labelBh;
	Label labelBl;
	Label labelCx;
	Label labelCh;
	Label labelCl;
	Label labelDx;
	Label labelDh;
	Label labelDl;
	Display display;
	Cursor cursor2;
	Shell shell;
	
	
    
	RunnableKursor(Parametry p, Display display, Cursor cursor2, Shell shell) {
		this.m = p.m;
		this.labelAx = p.labelAx;
		this.labelAh = p.labelAh;
		this.labelAl = p.labelAl;
		this.labelBx = p.labelBx;
		this.labelBh = p.labelBh;
		this.labelBl = p.labelBl;
		this.labelCx = p.labelCx;
		this.labelCh = p.labelCh;
		this.labelCl = p.labelCl;
		this.labelDx = p.labelDx;
		this.labelDh = p.labelDh;
		this.labelDl = p.labelDl;
		this.display = display;
		this.cursor2 = cursor2;
		this.shell = shell;
	}
	public void run() {
        Point cursor = display.getCursorLocation();
        
        
        if(m.rejs.get("el").get()==1){
        	shell.setCursor(cursor2);
        }
        
        if(m.rejs.get("el").get()==0){
        	shell.setCursor(null);
        }
        
        if(m.rejs.get("eh").get()==1){
        	try {
			m.set("cx", cursor.x);
			m.set("dx", cursor.y);
        	} catch (TooLongValueException e) {
        		e.printStackTrace();
        		}
        }	
        
       	if(m.rejs.get("eh").get()==2){
       		display.setCursorLocation(m.rejs.get("cx").get(), m.rejs.get("dx").get());
       		try {
				m.set("eh", 0);
			} catch (TooLongValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
       	
       	if(m.rejs.get("eh").get()==3){
        	if(m.klawiszMyszy==0){
        		try {
        			m.set("bx", m.clickLewyCounterPress);
        		} catch (TooLongValueException e) {
        			e.printStackTrace();
        		}
        	}
        	if(m.klawiszMyszy==1){
        		try {
        			m.set("bx", m.clickPrawyCounterPress);
        		} catch (TooLongValueException e) {
        			e.printStackTrace();
        		}
        	}
       		
        }
       	
    	if(m.rejs.get("eh").get()==4){
    		if(m.klawiszMyszy==0){
        		try {
        			m.set("bx", m.clickLewyCounterPusc);
        		} catch (TooLongValueException e) {
        			e.printStackTrace();
        		}
        	}
        	if(m.klawiszMyszy==1){
        		try {
        			m.set("bx", m.clickPrawyCounterPusc);
        		} catch (TooLongValueException e) {
        			e.printStackTrace();
        		}
        	}
        }
        
    		
    	labelAx.setText(String.valueOf("Rejestr Ax = " + m.rejs.get("ax").get()));
	    labelAh.setText(String.valueOf("Rejestr Ah = " + m.rejs.get("ah").get()));
	    labelAl.setText(String.valueOf("Rejestr Al = " + m.rejs.get("al").get()));
		
	    labelBx.setText(String.valueOf("Rejestr Bx = " + m.rejs.get("bx").get()));
	    labelBh.setText(String.valueOf("Rejestr Bh = " + m.rejs.get("bh").get()));
	    labelBl.setText(String.valueOf("Rejestr Bl = " + m.rejs.get("bl").get()));
		
	    labelCx.setText(String.valueOf("Rejestr Cx = " + m.rejs.get("cx").get()));
	    labelCh.setText(String.valueOf("Rejestr Ch = " + m.rejs.get("ch").get()));
	    labelCl.setText(String.valueOf("Rejestr Cl = " + m.rejs.get("cl").get()));
		
	    labelDx.setText(String.valueOf("Rejestr Dx = " + m.rejs.get("dx").get()));
	    labelDh.setText(String.valueOf("Rejestr Dh = " + m.rejs.get("dh").get()));
	    labelDl.setText(String.valueOf("Rejestr Dl = " + m.rejs.get("dl").get()));
	    display.timerExec(50, this);

    }
}
