package com.gc.lists;



public class Arrays {

	
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 4, 5, 1, 2 }; 
		int [] counter = {0, 0, 0, 0, 0,};
		
		for(int i =0; i < arr.length; i ++)  {
			counter[arr[i] -1]++;
		}
		for( int i = 0; i < counter.length; i++) {
			System.out.println((i + 1) + ":" + counter[i]);
		}
	}
}
