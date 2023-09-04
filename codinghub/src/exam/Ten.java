package exam;

import java.util.*;

public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList(List.of(1,2,3,4,5));
		List<Integer> al1=new ArrayList();
		al1.addAll(al);
		for(Integer var:al1) {
			System.out.println(var);
		}
	}

}
