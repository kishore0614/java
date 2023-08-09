package collection;

import java.util.ArrayList;
import java.util.List;

public class sample {
	
	public static void main(String[] args) {
		
		List<Object> k = new ArrayList<>();
		
		k.add(10);
		k.add(20);
		k.add("Java");
		k.add("demo");
		k.add(true);
		k.add(false);
		k.add(5.6);
		k.add(5.5);
		k.add(null);
		k.add(null);
		
		System.out.println(k);
		
		k.remove("demo");
		System.out.println(k);
		
		boolean empty = k.isEmpty();
		System.out.println(empty);
		
		int size = k.size();
		System.out.println(size);
		
		Object object = k.get(2);
		System.out.println(object);
		
		
	}

}
