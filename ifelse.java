package com.nabilbank.impl;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		  System.out.println("Enter the Number");
		  Scanner SN= new Scanner(System.in);
		 
		   int i = SN.nextInt();
		 
		   if ( i ==10) {
			   System.out.println("this is 10 increments ");
		   } else if(i ==20) {
			   System.out.println("this is 20 increments");
		   } else if (i==30) {
			   System.out.println("this is 30 increments");
		   } else {
			   System.out.println("all greater then 3o alues"); 
		   }
		   
			
	}

}
