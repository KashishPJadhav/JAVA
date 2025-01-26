package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		
		int[] arr2 = new int[] {10,20,30,40,50};
		
		int[] arr3 = {10,20,30,40,50};
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		double[ ] arr4 = new double[3]; 
		System.out.println("Enter the array elements :: ");
		Scanner sc = new Scanner(System.in); 
		for (int i = 0; i < 3; i++) {
			arr4[i] = sc.nextDouble(); 
		}
		double sum = Program.arraySum(arr4); 
		System.out.println("Sum : "+sum);
	}

	public static double arraySum(double[] arr) {
		double total = 0.0; 
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i]; 
		}
		return total; 
		
	}

}
