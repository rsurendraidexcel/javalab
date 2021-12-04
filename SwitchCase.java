package com.controle.impl;

public class SwitchCase {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub		
	  int i;	  
	  //Switch case examples
	  
      for(i=1; i<=5; i++) {
			
		switch(i) {
			case 1:  
				System.out.println("Role  Number One");
				break;
			case 2:
				System.out.println("Role  Number Two");
				break;
			case 3:
				System.out.println("Role  Number Three");
				break;
			case 4:
				System.out.println("Role  Number Four");
				break;
			case 5:
				System.out.println("Role  Number Five");
				break;
			default:
				System.out.println("Not valid Number");
				
			}
		}
      System.out.println("--------------------------------------------------\n");
     // Using Assignment + operator
     // String Interpolation is process in which the placeholder are replaced with variable.
     // it just the print on screen out well format.
     //
      
     String name="Krishna";
     String address="Stay in Kathmanu Nepal";
     
     String fulladdr= name + "is " + address;
     
     String fulladdr1= String.format("%s is %s",name, address);
     
     System.out.println(fulladdr);
     System.out.println(fulladdr1);
     
     System.out.println("--------------------------------------------------\n");
        int j=1;
        int sum=0;
         
        int fact=1;
       
        do {
      	   System.out.println(String.format("value of Interator  is %d", j));
      	   sum = sum + j;
      	   fact *=j;
      	   
           j++;
        }while(j<=15);
        
       System.out.println( String.format("Total value of 10 Seriase Number = %s",sum));
       System.out.println( String.format("Total Factor= %d",fact));
      
     
	}

}