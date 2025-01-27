package com.sunbeam;

import java.util.Arrays;

/*
java.util.Arrays class contains lot of helper methods to perform operations on arrays.
All these methods are static methods -- called directly on classname.
Example:
	toString()
	sort()
	binarySearch()

https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
*/
public class Program {

	public static void main(String[] args) {
		int arr[] = {22,11,3,4,1}; 
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); 
		System.out.println(Arrays.toString(arr));
	}

}
