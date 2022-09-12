package com.arrays.demo;
import java.util.Arrays;
public class Array016 {
	 public static String[] removeElement(String[] arr, int index) {
	        String[] result = new String[arr.length - 1];
	        System.arraycopy(arr, 0, result, 0, index);
	        if (arr.length != index) {
	            System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);
	        }
	        return result;
	 }

	public static void main(String[] args) {
		 String[] arr = {"A", "C", "B", "C", "D"};
	        int index = 1;
	 
	        arr = removeElement(arr, index);
	        System.out.println(Arrays.toString(arr));

	}

}
