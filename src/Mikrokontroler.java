import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;


//przerwania funkcje , w sumie 10 jedno ci¹g³e np mszka, mo¿e bæ kilka przerwañ jednej funkcji kilka funkcji z przerwaniami  sprawko osk_zad1_nazwisko
public class Mikrokontroler {
	

	//tworzenie kalendarza
	Calendar cal = new GregorianCalendar();	

	//tworzenie hashmapy rej, która bêdzie zawieraæ rejestry
	Map <String, iRej> rejs = new HashMap <>();

	//licznik klikniêæ
	public int clickLewyCounterPress = 0;
	public int clickPrawyCounterPress;
	public int clickLewyCounterPusc = 0;
	public int clickPrawyCounterPusc = 0;

	public int klawiszMyszy;
	
	
	//tworzac obiekt klasy mikrokontroler tworz¹ siê 4 rejestry
	Mikrokontroler() throws TooLongValueException{
		
		rejs.put("ah", new Rej8(0));
		rejs.put("al", new Rej8(0));
		rejs.put("ax", new Rej16(rejs.get("ah"), rejs.get("al")));
				
		rejs.put("bh", new Rej8(0));
		rejs.put("bl", new Rej8(0));
		rejs.put("bx", new Rej16(rejs.get("bh"), rejs.get("bl")));
				
		rejs.put("ch", new Rej8(0));
		rejs.put("cl", new Rej8(0));
		rejs.put("cx", new Rej16(rejs.get("ch"), rejs.get("cl")));
				
		rejs.put("dh", new Rej8(0));
		rejs.put("dl", new Rej8(0));
		rejs.put("dx", new Rej16(rejs.get("dh"), rejs.get("dl")));
		
		rejs.put("eh", new Rej8(0));
		rejs.put("el", new Rej8(0));
		rejs.put("cv", new Rej16(rejs.get("eh"), rejs.get("el")));
				
	};
	
	//ustawianie rejestrow
	public void set(String name, int r) throws TooLongValueException{
		
		
		iRej rej = rejs.get(name);
		rej.set(r);
	}
	
		
		
}
