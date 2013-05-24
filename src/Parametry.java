import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class Parametry {
	Text text;
	Button krokowo;
	Mikrokontroler m;
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
	public Parametry(Text text2, Button button2, Mikrokontroler m2,Label labelAx2, Label labelAh2, Label labelAl2, Label labelBx2,	Label labelBh2, Label labelBl2, Label labelCx2, Label labelCh2, Label labelCl2, Label labelDx2, Label labelDh2, Label labelDl2, Label label) {
		this.text = text2;
		this.krokowo = button2;
		this.m = m2;
		this.labelAx = labelAx2;
		this.labelAh = labelAh2;
		this.labelAl = labelAl2;
		this.labelBx = labelBx2;
		this.labelBh = labelBh2;
		this.labelBl = labelBl2;
		this.labelCx = labelCx2;
		this.labelCh = labelCh2;
		this.labelCl = labelCl2;
		this.labelDx = labelDx2;
		this.labelDh = labelDh2;
		this.labelDl = labelDl2;
		this.label = label;
	}
	
}