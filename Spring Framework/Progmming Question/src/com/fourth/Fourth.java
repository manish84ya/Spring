package com.fourth;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) 
	{
		String str1="";
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		str=sc.nextLine();
		//String str="ac123hkm92abm668";
		//String str="abc123efg045khlm845";
		ArrayList<Integer> al=new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			Character ch=(Character)str.charAt(i);
			if(Character.isDigit(ch)==true)
			{
				str1+=String.valueOf(str.charAt(i));
			
			}
			else 
				
			{
				if(str1.length()>0)
				{
					
					al.add(Integer.parseInt(str1));
				}
				str1="";
				
			}
		count++;	
		}
		
		Character ch1=(Character)str.charAt(count-1);
		if(Character.isDigit(ch1)==true)
		{
			al.add(Integer.parseInt(str1));
			str1="";
		}
		int a=Integer.parseInt(String.valueOf(Collections.max(al)));
		System.out.println(a);
		
		
		


	}
}
