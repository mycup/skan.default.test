package com.algorithm;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] index = { 5,4,2,1,3,7,8,6};
		int temp;
		for (int i = 0; i < index.length-1; i++) {
			
			for (int j = 0; j < index.length-1-i; j++) {
				if(index[j] < index[j+1]) {
					temp = index[j];
					index[j] = index[j+1];
					index[j+1] = temp;
					
				}
			}
		}
		
		for (int i = 0 ; i < index.length; i++) {
			System.out.println(index[i]);
		}
	}
}
