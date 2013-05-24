import java.util.ArrayList;
import java.util.List;


public class Converter {
	
	private static final String END_LINE = System.getProperty("line.separator");
	private static String[] slowas;
	
	
	public static String rejestr(String command) {
		slowas = command.split(" ");
		slowas[1] = slowas[1].substring(0, slowas[1].length() - 1);
		return slowas[1];
	}	
	
	public static String rejestrFrom(String command) {
		slowas = command.split(" ");
		return slowas[2];
	}	

	public static boolean check(String command) {
		slowas = command.split(" ");
		 try { 
	         Integer.parseInt(slowas[2]); 
	     } catch(NumberFormatException e) { 
	         return false; 
	     }
	     return true;
	}	
	
	public static int liczba(String command) {
		slowas = command.split(" ");
		int s = Integer.parseInt(slowas[2]);
		return s;
	}
	
	public static String dziel(String command, int i) {
		slowas = command.split(END_LINE);
		return slowas[i];
	}
	
	public static String[] rozdziel(String commands) {
		List<String> slowasy = new ArrayList<String>();
		
		for (String line : commands.split(END_LINE)){
			String i_linia = line.trim();
			if(i_linia.equals("")){
				
			}else{
				slowasy.add(line);
			}
		}
		
		return slowasy.toArray(new String[slowasy.size()]);
	}
	
	public static int licz(String command) {
		slowas = command.split("\n");
		return slowas.length;
	}
}
