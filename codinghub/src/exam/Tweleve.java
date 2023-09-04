package exam;

class Myth1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=6;
		while(n>0) {
			System.out.println("1");
			n--;
		}
		
	}
	
}
class Myth2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n=6;
		while(n>0) {
			System.out.println("5");
			n--;
		}
		
	}
	
}

public class Tweleve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myth1 th=new Myth1();
		Myth2 th1=new Myth2();
		Thread t=new Thread(th);
		Thread t1=new Thread(th1);
		t.setPriority(1);
		t1.setPriority(10);
		t.start();
		t1.start();
		
	

	}

}
