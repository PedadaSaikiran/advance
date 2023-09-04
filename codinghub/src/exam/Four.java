package exam;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4,5};
		int[]b= {6,7,8,9,10};
		int c[] =new int[a.length+b.length];
		int x=0;
		for(int i=0;i<a.length;i++) {
			c[x]=a[i];
			x++;
		}
		int y=a.length;
		for(int j=0;j<b.length;j++) {
			c[y]=b[j];
			y++;
		}
		int temp=0;
		for(int k=0;k<c.length-1;k++) {
			if(c[k]<c[k+1]) {
				temp=c[k];
				c[k]=c[k+1];
				c[k+1]=temp;
				k=-1;
			}
		}
		for(int v :c) {
			System.out.print(v+" ");
		}

	}

}
