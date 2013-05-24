import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;


public class Mikrotests {

//ustawianie rejestrów
	@Test 
	public void test_setAx_expect4() throws TooLongValueException {
		Mikrokontroler m = new Mikrokontroler();
		short expected = 4;
		m.set("ax", expected);
		iRej rej = m.rejs.get("ax");
		int actual = rej.get();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_setAx_expect300() throws TooLongValueException {
		Mikrokontroler m = new Mikrokontroler();
		short expected = 300;
		m.set("ax", expected);
		iRej rej = m.rejs.get("ax");
		int actual = rej.get();
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected=TooLongValueException.class)
	public void test_tooLong_expect4() throws TooLongValueException {
		Mikrokontroler m = new Mikrokontroler();
		m.set("ax", Integer.MAX_VALUE);
	}	
	
//ustawianie rejestrów
	@Test 
	public void test_setAh_expect4() throws TooLongValueException {
		Mikrokontroler m = new Mikrokontroler();
		short expected = 4;
		m.set("ax", expected);
		iRej rej = m.rejs.get("ax");
		int actual = rej.get();
		Assert.assertEquals(expected, actual);
	}
	
	@Test 
	public void test_setAh_expect210() throws TooLongValueException {
		Mikrokontroler m = new Mikrokontroler();
		short expected = 210;
		m.set("ax", expected);
		iRej rej = m.rejs.get("ax");
		int actual = rej.get();
		Assert.assertEquals(expected, actual);
	}
	
	@Test 
	public void test_setDl_expect4() throws TooLongValueException {
		Mikrokontroler m = new Mikrokontroler();
		short expected = 4;
		m.set("dl", expected);
		iRej rej = m.rejs.get("dl");
		int actual = rej.get();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_setAh_expect300() throws TooLongValueException {
		Mikrokontroler m = new Mikrokontroler();
		short expected = 300;
		m.set("ah", expected);
		iRej rej = m.rejs.get("ah");
		int actual = rej.get();
		Assert.assertEquals(expected, actual);
	}
		
	@Test
	public void test_AhtooLong_expect4() throws TooLongValueException {
		Mikrokontroler m = new Mikrokontroler();
		m.set("ah", Short.MAX_VALUE);
	}
	
//parsowanie komendy	
	@Test
	public void test_parseTextFromCommand() throws TooLongValueException {
		//Mikrokontroler m = new Mikrokontroler();
		//Command cmd = new Command(m);
		String[] expected = {"mov", "ax", "bx"};
		String[] actual = "mov ax bx".split(" ");
		Assert.assertArrayEquals(expected, actual);
	}
	
//komenda mov	
		@Test
		public void test_executeMov_movAxBx() throws TooLongValueException, BadCommandException {
			Mikrokontroler m = new Mikrokontroler();
			Parse p = new Parse();
			m.set("ax", 5);
			m.set("bx", 1);					
			
			ICommand cmd = p.parse("mov ax, bx");
			cmd.execute(m);
			
			int expected = 1;
			int actual = m.rejs.get("ax").get();
			Assert.assertEquals(expected, actual);
		}

//komenda add
		@Test
		public void test_executeAdd_addAxBx() throws TooLongValueException, BadCommandException {
			Mikrokontroler m = new Mikrokontroler();
			Parse p = new Parse();
			m.set("ax", 5);
			m.set("bx", 1);					
			
			ICommand cmd = p.parse("add ax, bx");
			cmd.execute(m);
			
			int expected = 6;
			int actual = m.rejs.get("ax").get();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void test_executeAdd_addAx20() throws TooLongValueException, BadCommandException {
			Mikrokontroler m = new Mikrokontroler();
			Parse p = new Parse();
			m.set("ax", 5);
		
			ICommand cmd = p.parse("add ax, 20");
			cmd.execute(m);
			
			int expected = 25;
			int actual = m.rejs.get("ax").get();
			Assert.assertEquals(expected, actual);
		}
		
//komenda add	
		@Test
		public void test_executeSub_subAxBx() throws TooLongValueException, BadCommandException {
			Mikrokontroler m = new Mikrokontroler();
			Parse p = new Parse();
			m.set("ax", 2);
			m.set("bx", 1);					
			
			ICommand cmd = p.parse("sub ax, bx");
			cmd.execute(m);
			
			int expected = 1;
			int actual = m.rejs.get("ax").get();
			Assert.assertEquals(expected, actual);
		}
		
		
		@Test
		public void test_convert_dziel() {
			final String END_LINE = System.getProperty("line.separator");
			String[] actual = Converter.rozdziel("add ax, 4" + END_LINE + END_LINE + "mov bx, ax");
			String[] expected = {"add ax, 4", "mov bx, ax"};
			Assert.assertArrayEquals(expected, actual);
		}

		@Test
		public void test_getYear() {
			Calendar cal = new GregorianCalendar();		
			int expected = 2013;
			int actual = cal.get(Calendar.YEAR);
			Assert.assertEquals(expected, actual);
		}		

//		@Test
//		public void test_int33hF3() throws TooLongValueException, BadCommandException {
//			
//			//DisplayMock mockDisplay = new DisplayMock();
//			//'RunnableKursor runnableKursor = new RunnableKursor(null, mockDisplay);
//			
//			Mikrokontroler m = new Mikrokontroler();
//			Parse p = new Parse();
//			m.set("ah", 3);
//						
//			ICommand cmd = p.parse("int 33h");
//			cmd.execute(m);
//			
//			int expected = 0;
//			int actual = m.rejs.get("ah").get();
//			Assert.assertEquals(expected, actual);
//		}
		
		
//int 1ah fun 02h	
//		@Test
//		public void test_int1ahF02h() {
//			Mikrokontroler m = new Mikrokontroler();
//			Parse p = new Parse();
//			m.set("ax", 2);
//			m.set("bx", 1);					
//			
//			ICommand cmd = p.parse("sub ax, bx");
//			cmd.execute(m);
//			
//			int expected = 1;
//			int actual = m.rejs.get("ax").get();
//			Assert.assertEquals(expected, actual);
//		}

	
//	@Test
//	public void test_commandMovAxBx_expect() throws TooLongValueException {
//		Mikrokontroler m = new Mikrokontroler();
//		short expected = 4;
//		m.set("bx", expected);
//		String command = "mov ax, bx";
//		Command com = new Command(m);
//		com.execute(command);
//		short actual = m.rejs.get("ax").get();
//		assertSame(expected, actual);
//		
//	}

}
