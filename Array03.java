package com.arrays.demo;

public class Array03 {

	public static void main(String[] args) {
			  
		int[] numbers = new int[]{20, 35, 25, 52, -16, 60, -90};
			       //calculate sum of all array elements
	    int sum = 0;
			  for(int i=0; i < numbers.length ; i++)
			   sum = sum + numbers[i];
			       //calculate average value
			    double average = sum / numbers.length;
			        System.out.println("Average value of the array elements is : " + average); 
			   }

	}

