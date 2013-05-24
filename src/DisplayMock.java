import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;


public class DisplayMock extends Display {

	public Point getCursorLocation() {
		return new Point(5, 5);
	}
	
}
