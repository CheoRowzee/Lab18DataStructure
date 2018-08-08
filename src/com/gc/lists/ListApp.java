package com.gc.lists;
import com.gc.lists.MyLIst;

public class ListApp {

	public static void main(String[] args) {
//		MyLIst list = new MyArrayList();
//		test(list);
		MyLinkedList list =  new MyLinkedList();
		test(list);
		
		
		
		

	}

	private static void test(MyLinkedList list) {
	
		
	}

	private static void test(MyLIst list)  {
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtBeginning("C");
		//list.removeFromBeginning();
		list.removeAt(3);
		
		System.out.println(list);
		System.out.println(list.size());
		
		
	}
}
