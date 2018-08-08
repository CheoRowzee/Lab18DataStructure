package com.gc.lists;


public interface MyLIst {
	
	
	void addAtBeginning(String data);
	
	void removeFromBeginning();
	
	void addAtEnd(String data);
	
	void removeFromEnd();
	
	String get(int index);
	
	int size();//how many items are in the list

	void insertAt(int index, String data);

	void removeAt(int index);
	}
	


