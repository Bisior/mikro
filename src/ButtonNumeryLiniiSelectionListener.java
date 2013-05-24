import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;


public class ButtonNumeryLiniiSelectionListener extends SelectionAdapter {
	
	int czyDodane = 0;
    int counter = 0;
	private Text text;
	String commands = "";
	private static final String END_LINE = System.getProperty("line.separator");
	Button button;
	
    
	ButtonNumeryLiniiSelectionListener(Parametry p, Button button) {
		this.text = p.text;
		this.button = button;

	}
  	
	  @Override
	  public void widgetSelected(SelectionEvent e) {
		  
		  commands = text.getText();
		  if(!commands.isEmpty() && czyDodane == 0){
			  String[] cmds = commands.split(END_LINE);
			  String nowy = "";
			  for(counter = 0;counter<cmds.length; counter++){
				  nowy += String.valueOf(counter+1 + ". " + cmds[counter] + END_LINE);
			  }
			  text.setText(nowy);
			  czyDodane = 1;
			  button.setText("Usuñ numery linii");
		  }else if((!commands.isEmpty()) && czyDodane == 1){
			  String[] cmds = commands.split(END_LINE);
			  String nowy = "";
			  for(counter = 0;counter<cmds.length; counter++){
				  String[] tmp = cmds[counter].split(" ");
				  if(!tmp[0].isEmpty()){
					  if(Character.isDigit(tmp[0].charAt(0))){
						 for(int i = 1;i<tmp.length; i++)
							 nowy=nowy+tmp[i]+" ";
					  }else {
						  for(int i = 0;i<tmp.length; i++)
								 nowy=nowy+tmp[i]+" ";
					  }
				  }
				  nowy += END_LINE;
			  }
			  text.setText(nowy);
			  czyDodane = 0;
			  button.setText("Dodaj numery linii");
		  }
		  

		  
	  
	  }
}
