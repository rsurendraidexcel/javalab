package com.controle.impl;

public class ForLoop {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("===============doble While loop===========================");
		    int column = 0;
	        int raw = 0;
	    

	        while (column < 5) {
	            while(raw < 5) {
	                System.out.print("* \t");
	                raw ++;
	            }
	            System.out.print("\n");
	            raw = 0;
	            column ++;
	        }
	        
	        System.out.println("----------------doble For loop-------------------------------");

	        for(column = 1; column <= 5; column ++) {
	            for(raw = 0; raw < 5 - column; raw ++) {
	                System.out.print(" ");
	            }

	            for(raw = 0; raw < column; raw ++) {
	                System.out.print("* ");
	            }
	            System.out.print("\n");
	        }
	  }

}
