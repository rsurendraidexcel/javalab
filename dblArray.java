package com.controle.impl;

public class dblArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A =  new int[][] { {10, 11 ,13}, {21, 20, 40 }, {10,50,20} };
		
		int[][] B =  new int[][] { {4, 7 ,4}, {9, 6, 2 }, {7,8,9} };
		
		
		// A Matric print
		System.out.println("\n\n--------------A matrix---------------");
	   for(int  i=0; i < A.length; i++) {
		    for( int z=0; z < A.length; z++) {
		    	 System.out.printf("\t %d", A[i][z]);
		    }
		    System.out.println("");
	     }

	      // B Matrix
			System.out.println("------------B Matrix--------------");
		   for(int  i=0; i < B.length; i++) {
			    for( int z=0; z < B.length; z++) {
			    	 System.out.printf("\t %d",B[i][z]);
			    }
			    System.out.println("");
		     }
		 
		    // A*B Matrix
	    	System.out.println("------------A*B Matrix-------------");
			   for(int  i=0; i < B.length; i++) {   
				    for( int z=0; z < B.length; z++) {
				    	 System.out.printf("\t %d",A[i][z]*B[i][z]);
				    }
				    System.out.println("");
			     }
			   
			// A+B Matrix
		    	System.out.println("------------A+B Matrix-------------");
				   for(int  i=0; i < B.length; i++) {
					    for( int z=0; z < B.length; z++) {
					    	 System.out.printf("\t %d",A[i][z]+B[i][z]);
					    }    
					    System.out.println("");
				     }	
				   
			   System.out.println("-------------------------------------");
   
	}

}
