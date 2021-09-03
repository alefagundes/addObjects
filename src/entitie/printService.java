package entitie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class printService<T> {
	
	List<T> list = new ArrayList<>();
	
	
	
	public void addValue(T object) {
		list.add(object);
	}
	
	public T first() {
		if(list.isEmpty()) {
			System.out.println("The list is Empty!");
		}
			return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int i=1;i<list.size();i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.print("]");
	}

}
