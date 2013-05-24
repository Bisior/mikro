
public class Rej8 implements iRej  {
	
	int r8;
	public Rej8(int i) throws TooLongValueException {
		this.set(i);
	}

	public void set(int y) throws TooLongValueException {
		if(y>255&&y<0){
			throw new TooLongValueException();
		}
		r8 = y;
		
	}

	public int get() {
		// TODO Auto-generated method stub
		return r8;
	}

}
