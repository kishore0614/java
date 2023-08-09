package collection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class test {
	
	public static void main(String[] args) {
		Map<Integer, Object> t = new TreeMap<>();
		
		t.put(1, 20);
		t.put(2, 30);
		t.put(3, 40);
		t.put(4, 50);
		t.put(5, 60);
		t.put(6, null);
		t.put(7, null);
		
		System.out.println(t);
		
		int size = t.size();
		System.out.println(size);
		
		Set<Integer> keySet = t.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = t.values();
		System.out.println(values);
		
		Set<Entry<Integer, Object>> entrySet = t.entrySet();
		System.out.println(entrySet);
		
		boolean containsKey = t.containsKey(5);
		System.out.println(containsKey);
		
		t.clear();
		System.out.println(t);
		
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
			
			
		}
			
		}
		
		

	}


