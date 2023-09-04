package exam;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HAPPY NEW YEAR";
		String[] s = str.split(" ");
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			count = 0;
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == 'A' || s[i].charAt(j) == 'E' || s[i].charAt(j) == 'I' || s[i].charAt(j) == 'O'
						|| s[i].charAt(j) == 'U') {
					count++;
				}
				

			}
			
			if(count==2) {
				System.out.println(s[i]);
			}
			
		
		}
	}

}
