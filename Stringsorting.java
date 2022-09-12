package com.arrays.demo;
import java.util.Scanner;

public class Stringsorting {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	String names[]=new String[4];
	
	System.out.println("Enter" + names.length+"names:");
	for(int i=0; i<names.length;i++)
	{
		names[i]=scanner.nextLine();
		
	}
	//before sorting
	
	System.out.println("Before Sorting: ");
	
	for(int i=0; i<names.length; i++) {
		System.out.println(names[i]);
	}
	//sorting part
	
   for(int i=0;i<names.length;i++) {
	   for(int j=i+1;j<names.length;i++) {
		   if(names[i].compareTo(names[j])>0) {
			   String temp=names[i];
			   names[i]=names[j];
			   names[j]=temp;
		   }
	   }
   }
   //after sorting
   System.out.println("After Sorting:");
   for(int i=0;i<names.length;i++) {
	   System.out.println(names[i]);
	   
   }
   
   scanner.close();
	}

}
