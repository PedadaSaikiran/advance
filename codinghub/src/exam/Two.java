package exam;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1,1,1,2,0,0,2,7,9,45,1,1} ;
		boolean[] b = new boolean[a.length];
		int count=1;
		for(int i=0;i<a.length;i++) {
			if(b[i]==true) {
				continue;
			}
			count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b[j]=true;
					count++;
					
				}
			}
			if(count>=1) {
				System.out.println(a[i]+"===>"+count);
			}
		}
	}

}
