package com.controle.impl;

public class methodCalculator {

    int result;	
	
	// void Method
     void  dispaly() {
    	 System.out.println("Result of Calculator:");
     }         
     // Return Type method
     String  show() {
    	 return "Welcome to the world";
     }
      int getResult() {
    	  return result;
     }
     // Parameter Return type method
      int add (int x, int y) {
    	 return x+y;
     }
      
      int substract (int x, int y) {
     	 return x-y;
      }
      
      int multiply (int x, int y) {
     	 return x*y;
      }
	
}