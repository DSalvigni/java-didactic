package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;


public class App {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//Only with linked list i do iterator
		LinkedList<String> iter = new LinkedList<String>();
		iter.add("ggg");
		iter.add("ALallalaIAjuiAJ");
		iter.add("ggg");
		Iterator<String> it = iter.iterator();
		//FOr iterator
		while(it.hasNext()) {
			String value = it.next();
			System.out.println("From Iteration -> "+value);
		}
		
		
		map.put(1,"ALallalaIAjuiAJ");
		map.put(2,"ALrrr");
		map.put(2,"ALrrr");
		map.put(4,"urAJ");
		map.put(5,"AtrtgrlaIAjuiAJ");
		
		System.out.println("Hasmap called by get + key "+map.get(4));
		
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			list.add(value);
			System.out.println("From HAshMAp "+key + " -> "+ value);
		}
		
		for(String value: list) {
			System.out.println("From Array ->"+value);
		}
		
		
	
	}

}
