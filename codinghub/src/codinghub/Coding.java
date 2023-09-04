package codinghub;
	
public class Coding {

	public static void main(String[] args) {
		Add a = new Add();
		String[] st =a.calAdd();
		for(String temp:st) {
			System.out.print(temp+" ");
		}
	}

}
class Add
{
	String[] s = {"sai","kiran","pedada"};
	public String[] calAdd() {
		for(int i=0;i<s.length;i++) {
			s[i]=s[i].toUpperCase();
			
		}
		return s;
		
	}
}
