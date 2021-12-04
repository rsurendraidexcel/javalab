package com.controle.impl;





public class arrayTotal {
	public static void main(String[] args)
	{
	
		int[] myArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
	    int total = 0;
	   
	// add each element's value to total
	for (int items : myArray) {			
		 System.out.printf("Item : %d %n", items);
		 total += items;
		}
	
    System.out.println("-------------------------------\n");
	System.out.printf("Total of array elements: %d%n", total);
	System.out.printf("Average total value %d%n", total/myArray.length);
	}

}
