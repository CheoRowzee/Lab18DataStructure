package com.gc.lists;

import java.util.Arrays;

public class MyArrayList implements MyLIst {

	String[] array = new String[4];

	int length = 0;

	private boolean isFull() {
		return length == array.length;
	}

	private void doubleLength() {

		// make a new copy of the array that is twice as long
		array = Arrays.copyOf(array, array.length * 2);

	}

	@Override
	public void removeAt(int index) {
		if (index >= 0 && index < length) {
			System.out.println("test: " + array[index]);
			for (int i = index; i < length; i--) {
				array[i] = array[i + 1];
			}
			length--;
			// array[index] = null;
		}
	}
	@Override
	public void insertAt(int index, String data) {
		if (isFull()) {
			doubleLength();
		}
		if (index >= 0 && index <= length) {
			for (int i = length; i > index; i--) {
				array[i] = array[i - 1];
			}
			array[index] = data;
			length++;
		}

	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
		}
		// loop backwards and shift all the items over to make room for the new one
		for (int i = length; i > 0; i--) {
			array[i] = array[i - 1];
		}
		// set first element and increment length
		array[0] = data;
		length++;
	}

	@Override
	public void removeFromBeginning() {
		if (isFull()) {
			doubleLength();
		}
		for (int i = 0; i < length; i++) {
			array[i] = array[i + 1];
		}
		length--;
	}

	@Override
	public void addAtEnd(String data) {
		if (isFull()) {
			// if our array is out of space, double the size
			doubleLength();
		}
		// set the next item in the array and increment the length
		array[length] = data;
		length++;// length = length + 1;

	}

	@Override
	public void removeFromEnd() {
		// Clear the last slot and decrement the length
		array[length - 1] = null;
		length--;
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}

}
