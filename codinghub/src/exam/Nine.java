package exam;
interface Calc1{ 
	public void add(double x,double y);
	public void sub(double x,double y);
}
interface Calc2 extends Calc1
{
	public void mul(double x,double y);
	public void div(double x,double y);
	
}
class ArthOp implements Calc2{

	@Override
	public void add(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println(x+y);
	}

	@Override
	public void sub(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println(x-y);
	}

	@Override
	public void mul(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println(x*y);
	}

	@Override
	public void div(double x, double y) {
		// TODO Auto-generated method stub
		System.out.println(x/y);
	}
	
}
public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArthOp ap=new ArthOp();
		ap.add(10, 5);
		ap.sub(10, 3);
		ap.mul(2, 3);
		ap.div(10, 5);
		
	}

}
