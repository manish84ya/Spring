package com.second;

public class SecondProgram {
	public static void main(String[] args) {
		int[] arr = { 15, 0, 39, 31, 0, 1, 0, 0, 21, 22 };
		second(arr);
	}

	public static void second(int[] arr) {
		int j = 0;
		int count=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] != 0) 
			{
				System.out.println(arr[i]);
			} 
			else
			{
				
				count++;
			}

		}
		for (int p = 0; p < count; p++) 
		{
			System.out.println(0);

		}

	}
}
