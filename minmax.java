package com.nabilbank.impl;

public class minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min, max;
		
		int  numblist[] = new int[5];
		
		// Indivual value set
		
		numblist[0]=50;
		numblist[1]=340;
		numblist[2]=490;
		numblist[3]=47;
		numblist[4]=37;
	
		min = max = numblist[0];
			
		///fil the array values
//		for( int i=0; i< numblist.length; i ++) {
//			numblist[i]= 34*i+20;
//		}
//		
		// all array vlaues 
		
		for( int i=0; i< numblist.length; i ++) {
			 System.out.println("hellow ");
		}
		
		
		
		for( int i=0; i< numblist.length; i ++) {
			 System.out.println(i +"=>"+numblist[i]);
		}
		
		// f min and max values
		
		for( int i=0; i< numblist.length; i ++) {
			if( min < numblist[i] ) {
			  max=numblist[i];  
		  }	
		  if(max > numblist[i] ) {
			  min =numblist[i];
		  }
		}
		
	  System.out.println("Minmum value=> "+min);
	  System.out.println("Max value =>"+max);
	  
		
	}

}
