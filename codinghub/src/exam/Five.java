package exam;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Vital Information Resource Under Seize";
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length();j++) {
				if(j==0) {
					System.out.print(s[i].charAt(j));
				}
			}
		}
	}

}
