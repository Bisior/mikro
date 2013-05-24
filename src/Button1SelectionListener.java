import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


public class Button1SelectionListener extends SelectionAdapter {
	
	private static final String END_LINE = System.getProperty("line.separator");
    int counter = 0;
	private Text text;
	private Mikrokontroler m;
	Parse p = new Parse();
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
	Label label;
    
	Button1SelectionListener(Parametry p) {
		this.text = p.text;
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
		this.label = p.label;
	}
  	
	  @Override
	  public void widgetSelected(SelectionEvent e) {
	    // Handle the selection event
		   
		  String command = text.getText().toLowerCase();
		  //command = command.replaceAll("\\s+", " ");
		  
			ICommand cmd = null;
			try {
				
				for (String line : command.split(END_LINE)){
					
					if(!line.equals("")){
						if(Character.isDigit(line.charAt(0))){
							String[] tmp = line.split(" ");
							String nowy="";
							 for(int i = 1;i<tmp.length; i++)
								 nowy=nowy+tmp[i]+" ";
							 line = nowy;
						  }
						
						line=line.replaceAll("\\s+", " ");
						cmd = p.parse(line);
					
					try {
						cmd.execute(m);
						label.setText("Program skompilowa³ siê poprawnie.");
					} catch (TooLongValueException e1) {
						label.setText("Poda³eœ wiêksz¹ wartoœæ, ni¿ mo¿e pomieœciæ rejestr.");
					}}
				    
				}
			} catch (BadCommandException e2) {
				label.setText("Poda³eœ z³¹ komendê.");
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
		
	  }
}