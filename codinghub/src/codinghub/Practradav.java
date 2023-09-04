package codinghub;

public class Practradav {
	public static void main(String[] args) {
		Add1 a= new Add1();
		a.calshow();
		
		
	}
}
class Add1{
	Sai s = new SaiImpl();
	public Sai calshow() {
		s.show();
		return s;
	}
}
class SaiImpl implements Sai{
	
	public void show() {
		System.out.println("SAIKIRAN");
	}
}
interface Sai{
	public void show();
}
