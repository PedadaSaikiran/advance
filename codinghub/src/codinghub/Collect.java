package codinghub;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1=Data.getData();
		System.out.println(e1.getName()+" "+e1.getempid());

	}

}
class Data{
	static Emp e= new Emp();
	public static Emp getData() {
		e.setName("saikiran");
		e.setId(152);
		return e;
	}
}
class Emp{
	private String name;
	 private int empid;
	
	public void setName(String name) {
		this.name=name;
	}
	public void  setId(int empid) {
		this.empid=empid;
	}
	public String getName()
	{
		return name;
	}
	public int getempid() {
		return empid;
	}
}
