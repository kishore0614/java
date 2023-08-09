package collection;

import java.util.ArrayList;
import java.util.List;

public class demo {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);   l.add(11);  l.add(12);  l.add(13);  l.add(14);
		l.add(15);   l.add(16);  l.add(17);  l.add(18);  l.add(19);
		l.add(20);   l.add(21);  l.add(22);  l.add(23);  l.add(24);
		
		System.out.println(l);
		
		Integer integer = l.get(1);
		System.out.println(integer);
		
		
		boolean empty = l.isEmpty();
		System.out.println(empty);   //ctrl+2, l
		
		int size = l.size();
		System.out.println(size);  //ctrl+2, l
		
		boolean contains = l.contains(23);
		System.out.println(contains);
		
		l.remove(11);
		System.out.println(l);
		
		l.set(9, 24);
		l.set(8, 24);
		System.out.println(l);
		
		l.add(25);
		l.add(26);
		l.add(27);
		System.out.println(l);
		
	}

}
