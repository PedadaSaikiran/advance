package exam;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello all good morning";
		String[] s=str.split(" ");
		int count=0;
		
		for(int i=0;i<s.length;i++) {
			boolean[] b =new boolean[s[i].length()];
			for(int j=0;j<s[i].length();j++) {
				count=0;  
				if(b[j]==true) {
					continue;
				}
				for(int k=j+1;k<s[i].length();k++) {
					if(s[i].charAt(j)==s[i].charAt(k)) {
						b[k]=true;
						count++;
					}
				}
				if(count>=0) {
					if(j==0) {
						System.out.print((char)(s[i].charAt(j)-32));
					}
					else {
					System.out.print(s[i].charAt(j));}
				}
				
			}
			System.out.print(" ");
		}
	}

}
