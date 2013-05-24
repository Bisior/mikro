import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;


public class ListaSelectionListener implements SelectionListener {
	
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
	List list;
	Label label;
	
    
	ListaSelectionListener(Parametry p, List list, Label label) {
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
		this.list = list;
		this.label = label;
	}

	public void widgetSelected(SelectionEvent event) {
  	  Parse p = new Parse();
  	  int wybrane = list.getSelectionIndex();
      switch (wybrane) {
      case 0:
			try {
				p.parse("mov ah, 2").execute(m);
				p.parse("int 1ah").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 1ah\nFunkcja 2 - Odczytuje czas zegara.\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 2.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Ch godzinê, w Cl minuty,\nW Dh sekundy, w Dl 1 dla czasu letniego i 0 dla czasu zimowego.");
			
			break;
			
      case 1:
			try {
				p.parse("mov ah, 3").execute(m);
				p.parse("int 1ah").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 1ah\nFunkcja 3 - Zmienia czas zegara.\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 3.\n" +
					"W rejestrze Ch godzinê, w Cl minuty,\nW Dh sekundy, w Dl 1 dla czasu letniego i 0 dla czasu zimowego.\nPo wywo³aniu przerwania zmienia siê czas zegara \nzgodnie z ustawionymi rejestrami.");
			break;
			
      case 2:
			try {
				p.parse("mov ah, 4").execute(m);
				p.parse("int 1ah").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 1ah\nFunkcja 4 - Odczytuje datê kalendarza.\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 4.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Ch pierwsze dwie cyfry roku, w Cl ostatnie dwie cyfry roku,\nW Dh miesi¹c, w Dl dzieñ.");
			break;
			
		case 3:
			try {
				p.parse("mov ah, 5").execute(m);
				p.parse("int 1ah").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 1ah\nFunkcja 5 - Zmienia datê kalendarza.\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 5.\n" +
					"W rejestrze Ch pierwsze dwie cyfry roku, w Cl ostatnie dwie cyfry roku,\nW Dh miesi¹c, w Dl dzieñ.\nPo wywo³aniu przerwania zmienia siê data kalendarza\nzgodnie z ustawionymi rejestrami.");
			break;
			
		case 4:
			try {
				p.parse("mov ah, 1").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 1 - Pokazuje kursor myszy\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 1.\nWywo³anie tej funkcji przerwania zwiêksza wartoœæ flagi kursora \ndo 0, " +
					"wtedy kursor jest wyœwietlany, zmniejszenie wartoœci flagi \ndo -1 powoduje jego znikniêcie.");
			break;
			
		case 5:
			try {
				p.parse("mov ah, 2").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 2 - Pokazuje kursor myszy\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 2\nWywo³anie tej funkcji przerwania zmniejsza wartoœæ flagi kursora \ndo -1, " +
					"wtedy kursor znika, zwiêkszenie wartoœci flagi \ndo 0 powoduje jego pojawienie siê.");
			break;
			
		case 6:
			try {
				p.parse("mov ah, 3").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 3 - Wyœwietla pozycjê kursora\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 3.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Cx poziom¹ pozycjê kursora, \nW Dx pionow¹ pozycjê kursora,\nW Bx status przycisków: 00 dla niewciœniêtych, 10 dla lewego \nwciœniêtego, 01 dla prawego wciœniêtego.");
			break;
			
		case 7:
			try {
				p.parse("mov ah, 4").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 4 - Ustawia pozycjê kursora\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 4.\n" +
					"W rejestrze Cx poziom¹ pozycjê kursora, \nW Dx pionow¹ pozycjê kursora.\nPo wywo³aniu tej funkcji przerwania kursor zostanie przeniesiony do \nustawionego w rejestrach punktu.");
			break;
			
		case 8:
			try {
				p.parse("mov ah, 5").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 5 - Informacja o wciœniêciu przycisku\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 5\n" +
					"Rejestr Bx = 0 dla lewego przycisku, Bx = 1 dla prawego.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Ax status przycisków: 00 dla niewciœniêtych, 10 dla lewego \nwciœniêtego, 01 dla prawego wciœniêtego,\nW rejestrze Bx iloœæ klikniêæ " +
					"przyciœniêæ wybranego przycisku,\nW Cx poziom¹ pozycjê kursora przy ostatnim klikniêciu,\nW Dx pionow¹ pozycjê kursora.");
			break;
			
		case 9:
			try {
				p.parse("mov ah, 6").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 6 - Informacja o puszczeniu przycisku\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 6\n" +
					"Rejestr Bx = 0 dla lewego przycisku, Bx = 1 dla prawego.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Ax status przycisków: 00 dla niewciœniêtych, 10 dla lewego \nwciœniêtego, 01 dla prawego wciœniêtego,\nW rejestrze Bx iloœæ klikniêæ " +
					"puszczeñ wybranego przycisku,\nW Cx poziom¹ pozycjê kursora przy ostatnim puszczeniu przycisku,\nW Dx pionow¹ pozycjê kursora.");
			break;
      }
      System.out.println("You selected: " + String.valueOf(wybrane));
      
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

    public void widgetDefaultSelected(SelectionEvent event) {
    	Parse p = new Parse();
    	  int wybrane = list.getSelectionIndex();
        switch (wybrane) {
        case 0:
			try {
				p.parse("mov ah, 2").execute(m);
				p.parse("int 1ah").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 1ah\nFunkcja 2 - Odczytuje czas zegara.\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 2.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Ch godzinê, w Cl minuty,\nW Dh sekundy, w Dl 1 dla czasu letniego i 0 dla czasu zimowego.");
			
			break;
			
      case 1:
			try {
				p.parse("mov ah, 3").execute(m);
				p.parse("int 1ah").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 1ah\nFunkcja 3 - Zmienia czas zegara.\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 3.\n" +
					"W rejestrze Ch godzinê, w Cl minuty,\nW Dh sekundy, w Dl 1 dla czasu letniego i 0 dla czasu zimowego.\nPo wywo³aniu przerwania zmienia siê czas zegara \nzgodnie z ustawionymi rejestrami.");
			break;
			
      case 2:
			try {
				p.parse("mov ah, 4").execute(m);
				p.parse("int 1ah").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 1ah\nFunkcja 4 - Odczytuje datê kalendarza.\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 4.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Ch pierwsze dwie cyfry roku, w Cl ostatnie dwie cyfry roku,\nW Dh miesi¹c, w Dl dzieñ.");
			break;
			
		case 3:
			try {
				p.parse("mov ah, 5").execute(m);
				p.parse("int 1ah").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 1ah\nFunkcja 5 - Zmienia datê kalendarza.\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 5.\n" +
					"W rejestrze Ch pierwsze dwie cyfry roku, w Cl ostatnie dwie cyfry roku,\nW Dh miesi¹c, w Dl dzieñ.\nPo wywo³aniu przerwania zmienia siê data kalendarza\nzgodnie z ustawionymi rejestrami.");
			break;
			
		case 4:
			try {
				p.parse("mov ah, 1").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 1 - Pokazuje kursor myszy\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 1.\nWywo³anie tej funkcji przerwania zwiêksza wartoœæ flagi kursora \ndo 0, " +
					"wtedy kursor jest wyœwietlany, zmniejszenie wartoœci flagi \ndo -1 powoduje jego znikniêcie.");
			break;
			
		case 5:
			try {
				p.parse("mov ah, 2").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 2 - Pokazuje kursor myszy\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 2\nWywo³anie tej funkcji przerwania zmniejsza wartoœæ flagi kursora \ndo -1, " +
					"wtedy kursor znika, zwiêkszenie wartoœci flagi \ndo 0 powoduje jego pojawienie siê.");
			break;
			
		case 6:
			try {
				p.parse("mov ah, 3").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 3 - Wyœwietla pozycjê kursora\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 3.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Cx poziom¹ pozycjê kursora, \nW Dx pionow¹ pozycjê kursora,\nW Bx status przycisków: 00 dla niewciœniêtych, 10 dla lewego \nwciœniêtego, 01 dla prawego wciœniêtego.");
			break;
			
		case 7:
			try {
				p.parse("mov ah, 4").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 4 - Ustawia pozycjê kursora\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 4.\n" +
					"W rejestrze Cx poziom¹ pozycjê kursora, \nW Dx pionow¹ pozycjê kursora.\nPo wywo³aniu tej funkcji przerwania kursor zostanie przeniesiony do \nustawionego w rejestrach punktu.");
			break;
			
		case 8:
			try {
				p.parse("mov ah, 5").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 5 - Informacja o wciœniêciu przycisku\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 5\n" +
					"Rejestr Bx = 0 dla lewego przycisku, Bx = 1 dla prawego.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Ax status przycisków: 00 dla niewciœniêtych, 10 dla lewego \nwciœniêtego, 01 dla prawego wciœniêtego,\nW rejestrze Bx iloœæ klikniêæ " +
					"przyciœniêæ wybranego przycisku,\nW Cx poziom¹ pozycjê kursora przy ostatnim klikniêciu,\nW Dx pionow¹ pozycjê kursora.");
			break;
			
		case 9:
			try {
				p.parse("mov ah, 6").execute(m);
				p.parse("int 33h").execute(m);
			} catch (TooLongValueException | BadCommandException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			label.setText("Przerwanie 33h\nFunkcja 6 - Informacja o puszczeniu przycisku\nPrzed wywo³aniem przerwania nale¿y ustawiæ rejestr Ah = 6\n" +
					"Rejestr Bx = 0 dla lewego przycisku, Bx = 1 dla prawego.\nPo wywo³aniu przerwania zwraca:\n" +
					"W rejestrze Ax status przycisków: 00 dla niewciœniêtych, 10 dla lewego \nwciœniêtego, 01 dla prawego wciœniêtego,\nW rejestrze Bx iloœæ klikniêæ " +
					"puszczeñ wybranego przycisku,\nW Cx poziom¹ pozycjê kursora przy ostatnim puszczeniu przycisku,\nW Dx pionow¹ pozycjê kursora.");
			break;
        }
        System.out.println("You selected: " + String.valueOf(wybrane));
        
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
