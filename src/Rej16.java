
public class Rej16 implements iRej {

	iRej h;
	iRej l;
//	public Rej16(int i) throws TooLongValueException {
//		h = new Rej8();
//		l = new Rej8();
//		this.set(i);
//				
//	}
	
	public Rej16(iRej h, iRej l) throws TooLongValueException {
		this.h = h;
		this.l = l;			
	}

	public void set(int i) throws TooLongValueException {
		if(i>Short.MAX_VALUE){
			throw new TooLongValueException();
		}
		
		h.set((i>>8) & 0xff);
		l.set(i & 0xff);
	}

	public int get() {
		int x = h.get();
		int y = l.get();
		int s = 256 * x + y;
		return s;
	}

}
