package exam;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="saikiran";
		str.toUpperCase();
		System.out.println("immutable String is not changed:"+str);
		str=str.toUpperCase();
		System.out.println("string is chnaged: "+str);
	}

}
