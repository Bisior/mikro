

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Text;



public class Okno {

	public static void main(String[] args) throws TooLongValueException {

		
	
		final Display display = new Display ();
		final Shell shell = new Shell (display);
		FormLayout layout= new FormLayout ();
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		shell.setLayout(layout);
	    shell.setText("Mikrokontroler");

		
	    final Mikrokontroler m = new Mikrokontroler();
	    
	    FormData data1 = new FormData();
	    data1.left = new FormAttachment(0,5);
	    data1.right = new FormAttachment(50,0);
	    data1.height = 300;
	    final Text text = new Text(shell, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
	    text.setLayoutData(data1);
	    
	    FormData data2 = new FormData();
	    data2.left = new FormAttachment(text,15);
	    data2.width = 100;
	    final Label labelAx = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelAx.setText("Rejestr Ax = " + String.valueOf(m.rejs.get("ax").get()));
	    labelAx.setLayoutData(data2);
	    	    
	    FormData data3 = new FormData();
	    data3.left = new FormAttachment(labelAx,5);
	    data3.width = 100;
	    final Label labelAh = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelAh.setText("Rejestr Ah = " + String.valueOf(m.rejs.get("ah").get()));
	    labelAh.setLayoutData(data3);
	    
	    FormData data4 = new FormData();
	    data4.left = new FormAttachment(labelAh,5);
	    data4.width = 100;
	    final Label labelAl = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelAl.setText("Rejestr Al = " + String.valueOf(m.rejs.get("al").get()));
	    labelAl.setLayoutData(data4);
	    
	    FormData data5 = new FormData();
	    data5.top = new FormAttachment(labelAx,5);
	    data5.left = new FormAttachment(text,15);
	    data5.width = 100;
	    final Label labelBx = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelBx.setText("Rejestr Bx = " + String.valueOf(m.rejs.get("bx").get()));
	    labelBx.setLayoutData(data5);
	    	    
	    FormData data6 = new FormData();
	    data6.left = new FormAttachment(labelAx,5);
	    data6.top = new FormAttachment(labelAh,5);
	    data6.width = 100;
	    final Label labelBh = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelBh.setText("Rejestr Bh = " + String.valueOf(m.rejs.get("bh").get()));
	    labelBh.setLayoutData(data6);
	    
	    FormData data7 = new FormData();
	    data7.left = new FormAttachment(labelAh,5);
	    data7.top = new FormAttachment(labelAl,5);
	    data7.width = 100;
	    final Label labelBl = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelBl.setText("Rejestr Bl = " + String.valueOf(m.rejs.get("bl").get()));
	    labelBl.setLayoutData(data7);
	    
	    FormData data8 = new FormData();
	    data8.top = new FormAttachment(labelBx,5);
	    data8.left = new FormAttachment(text,15);
	    data8.width = 100;
	    final Label labelCx = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelCx.setText("Rejestr Cx = " + String.valueOf(m.rejs.get("cx").get()));
	    labelCx.setLayoutData(data8);
	    	    
	    FormData data9 = new FormData();
	    data9.left = new FormAttachment(labelAx,5);
	    data9.top = new FormAttachment(labelBh,5);
	    data9.width = 100;
	    final Label labelCh = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelCh.setText("Rejestr Ch = " + String.valueOf(m.rejs.get("ch").get()));
	    labelCh.setLayoutData(data9);
	    
	    FormData data10 = new FormData();
	    data10.left = new FormAttachment(labelAh,5);
	    data10.top = new FormAttachment(labelBl,5);
	    data10.width = 100;
	    final Label labelCl = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelCl.setText("Rejestr Cl = " + String.valueOf(m.rejs.get("cl").get()));
	    labelCl.setLayoutData(data10);
	    
	    FormData data11 = new FormData();
	    data11.top = new FormAttachment(labelCx,5);
	    data11.left = new FormAttachment(text,15);
	    data11.width = 100;
	    final Label labelDx = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelDx.setText("Rejestr Dx = " + String.valueOf(m.rejs.get("dx").get()));
	    labelDx.setLayoutData(data11);
	    	    
	    FormData data12 = new FormData();
	    data12.left = new FormAttachment(labelAx,5);
	    data12.top = new FormAttachment(labelCh,5);
	    data12.width = 100;
	    final Label labelDh = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelDh.setText("Rejestr Dh = " + String.valueOf(m.rejs.get("dh").get()));
	    labelDh.setLayoutData(data12);
	    
	    FormData data13 = new FormData();
	    data13.left = new FormAttachment(labelAh,5);
	    data13.top = new FormAttachment(labelCl,5);
	    data13.width = 100;
	    final Label labelDl = new Label(shell, SWT.CENTER | SWT.BORDER);
	    labelDl.setText("Rejestr Dl = " + String.valueOf(m.rejs.get("dl").get()));
	    labelDl.setLayoutData(data13);
	    
	    FormData data14 = new FormData();
	    data14.top = new FormAttachment(labelDx,25);
	    data14.left = new FormAttachment(text,15);
	    final Button button =  new Button(shell, SWT.PUSH);
	    button.setText("Wykonaj");
	    button.setLayoutData(data14);
	    
	    FormData data15 = new FormData();
	    data15.top = new FormAttachment(labelDx,25);
	    data15.left = new FormAttachment(button,15);
	    final Button button2 =  new Button(shell, SWT.PUSH);
	    button2.setText("Wykonaj krokowo liniê 1");
	    button2.setLayoutData(data15);
	    
	    FormData data16 = new FormData();
	    data16.top = new FormAttachment(button2,25);
	    data16.left = new FormAttachment(text,15);
	    final List list = new List(shell, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
	    list.setLayoutData(data16);	  
	    list.setItems (new String [] {"Przerwanie 1Ah, 2", "Przerwanie 1Ah, 3", "Przerwanie 1Ah, 4", "Przerwanie 1Ah, 5", "Przerwanie 33h, 1", "Przerwanie 33h, 2", "Przerwanie 33h, 3", "Przerwanie 33h, 4", "Przerwanie 33h, 5", "Przerwanie 33h, 6"});
	    
	    FormData data17 = new FormData();
	    data17.top = new FormAttachment(button2,25);
	    data17.left = new FormAttachment(list,15);
	    data17.width = 400;
	    data17.height = 150;
	    final Label label = new Label(shell,  SWT.BORDER );
	    label.setLayoutData(data17);
	    
	    FormData data18 = new FormData();
	    data18.top = new FormAttachment(text,25);
	    data18.left = new FormAttachment(0,5);
	    data18.right = new FormAttachment(50,0);
	    final Label labelError = new Label(shell,  SWT.BORDER );
	    labelError.setLayoutData(data18);
	    
	    FormData data19 = new FormData();
	    data19.top = new FormAttachment(labelDx,25);
	    data19.left = new FormAttachment(button2,15);
	    final Button buttonNumeryLinii =  new Button(shell, SWT.PUSH);
	    buttonNumeryLinii.setText("Dodaj numery linii");
	    buttonNumeryLinii.setLayoutData(data19);
	    
	    Parametry par = new Parametry(text, button2, m, labelAx, labelAh, labelAl, labelBx, labelBh, labelBl, labelCx, labelCh, labelCl, labelDx, labelDh, labelDl, labelError);
	    
	    
	    Color black = display.getSystemColor (SWT.COLOR_BLACK);
	    PaletteData palette = new PaletteData (new RGB [] {black.getRGB()});
	    ImageData sourceData = new ImageData (2, 2, 1, palette);

	    final Cursor cursor2 = new Cursor(display, sourceData, 1, 1);
    
	    Runnable timer = new RunnableKursor(par, display, cursor2, shell);
	    display.timerExec(50, timer);
	    
	    Runnable clock = new RunnableClock(m, display);
	    display.timerExec(1000, clock);
	    
	    shell.addMouseListener(new MyMouseListener(par, display)); 
	    	    
	    button.addSelectionListener(new Button1SelectionListener(par)); 

	    button2.addSelectionListener(new Button2SelectionListener(par)); 
	    
	    buttonNumeryLinii.addSelectionListener(new ButtonNumeryLiniiSelectionListener(par, buttonNumeryLinii)); 
	    
	    list.addSelectionListener(new ListaSelectionListener(par, list, label));
	    
	   
	    


		shell.open();
		while (!shell.isDisposed()) {
		  if (!display.readAndDispatch())
		    display.sleep();
		}
		shell.close();
		display.dispose(); 
	}

}
