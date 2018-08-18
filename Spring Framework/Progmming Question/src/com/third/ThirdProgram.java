package com.third;

import java.util.Scanner;

public class ThirdProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int sum;
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter values");
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
			str += arr[i];
		}
		
		sum = Integer.parseInt(str) + 1;
		String str1 = String.valueOf(sum);
		int l = str1.length();
		int arr1[] = new int[l];
		for (int j = 0; j < l; j++) 
		{
			arr1[j] = Integer.parseInt(String.valueOf(str1.charAt(j)));
			System.out.print(arr1[j] + " ");

		}
		sc.close();

	}

}
