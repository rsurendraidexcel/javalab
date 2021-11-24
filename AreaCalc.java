package com.nabilbank.impl;

import java.util.Scanner;

public class AreaCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     //Find the are of trangle and Ractagle 
		
		  int h, l;
	      System.out.println("Please Enter the Height of Trangle");
	      Scanner sn= new Scanner(System.in);
	      
	      h=sn.nextInt();
	      
	      System.out.println("Please Enter the Length of Trangle");
	      l=sn.nextInt();
	      
	      int areaTragle = (h*l)/2;
	      
	      
	      if( l > h) {
	    	System.out.println("smaller Trangle Areay is ="+areaTragle);
	      }else {
	    	  System.out.println("Bigger Trangle Areay is ="+areaTragle); 
	      }
	      
	      
		 
	}

}
