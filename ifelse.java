package com.controle.impl;
public class ifelse {
	
	
	public void Println() {
		
		System.out.println("Prime Number");
	
	} 

	
	public void disaply0() {
		
		System.out.println("m1");
		System.out.println("m1");
		System.out.println("m1");
		System.out.println("m1");
		
	} 
	public void disaply1() {
		
		System.out.println("x1");
		System.out.println("x1");
		System.out.println("x1");
		System.out.println("x1");
		System.out.println("x1");
		System.out.println("x1");
		System.out.println("x1");
		System.out.println("x1");
		System.out.println("x1");
		System.out.println("x1");
		
	} 
	

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		   
       int nvalue=2;
       
       // call method
       ifelse obj= new ifelse();
		     
		    
       if(nvalue < 5) { 
    	   
    	   System.out.println("small"); 
    	   obj.disaply0();
    	   obj.disaply1();
    	   
       }else if(nvalue < 30) {
    	   
    	   System.out.println("mediam");
    	   obj.disaply0();
      
       }else if (nvalue < 90) { 
    	  
    	   System.out.println("very large");
    	 
       
       } else {
    	  
    	   System.out.println("no things");
    	   
       }
              		    
	}
	
	

}
