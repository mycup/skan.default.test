package com.algorithm;

public class SelectionSort {
	public static void main(String[] args) {
		int[] index = { 5,4,2,1,3,7,8,6};
		int indexMin , temp;
		
		for (int i = 0; i < index.length; i++) {
			indexMin = i ;
			for (int j = i+1; j < index.length; j++) {
				if(index[j] < index[indexMin]) {
					indexMin = j;
				}
			}
			temp = index[indexMin];
			index[indexMin] =  index[i];
			index[i] = temp;
			
			
		}
		
		for (int  i = 0 ; i < index.length; i++) {
			System.out.println(index[i]);
		}
	}
}
