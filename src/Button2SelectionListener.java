import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


public class Button2SelectionListener extends SelectionAdapter {
	
    int counter = 0;
	private Text text;
	private Button krokowo;
	private Mikrokontroler m;
	String commands = "";
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
	
    
	Button2SelectionListener(Parametry p) {
		this.text = p.text;
		this.krokowo = p.krokowo;
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
		  
		  commands = text.getText().toLowerCase();
		  if(!commands.isEmpty()){
			  String[] cmds = Converter.rozdziel(commands);
			  if(Character.isDigit(cmds[counter].charAt(0))){
					String[] tmp = cmds[counter].split(" ");
					String nowy="";
					 for(int i = 1;i<tmp.length; i++)
						 nowy=nowy+tmp[i]+" ";
					 cmds[counter] = nowy;
				  }
			  ICommand cmd;
			  try {
				  cmds[counter]=cmds[counter].replaceAll("\\s+", " ");
				  cmd = p.parse(cmds[counter]);
				cmd.execute(m);
				label.setText("Program skompilowa³ siê poprawnie.");
			  } catch (BadCommandException e1) {
				  label.setText("Poda³eœ z³¹ komendê.");
			  } catch (TooLongValueException e1) {
				  label.setText("Poda³eœ wiêksz¹ wartoœæ, ni¿ mo¿e pomieœciæ rejestr.");
			  }
			  counter++;
			  int lin = counter +1;
			  krokowo.setText(String.valueOf("Wykonaj krokowo liniê " + lin));
			  if (counter>=cmds.length){
				  counter = 0;
				  krokowo.setText("Wykonaj krokowo liniê 1");
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

		  
	  
	  }
}
