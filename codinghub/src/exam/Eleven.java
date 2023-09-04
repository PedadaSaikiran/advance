package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Eleven {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList(List.of(1,2,3,4,5));
		ListIterator<Integer> it =al.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			System.out.print(it.previous()+" ");
			
		}
	}

}
