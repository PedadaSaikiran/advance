package exam;

public class One {

	public static void main(String[] args) {
		int count=0;int high=10000;boolean flag =false;
		for(int low=2;low<=high;low++) {
			flag=false;
			for(int i=2;i<=low/2;i++) {
				if(low%i==0) {
					flag=true;
					break;
				}
			}
			if(flag!=true&&count<10) {
				int n =low,res=0;
				while(n>0) {
					int rem=n%10;
					res=res*10+rem;
					n=n/10;
				}
				if(res==low) {
					System.out.print(low+" ");
					count++;
				}
				
			}
		}

	}

}
