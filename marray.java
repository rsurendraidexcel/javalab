package com.nabilbank.impl;
public class marray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  days[] = new String[7];
		    
		
		// Array value input
	     days[0]="Sunday";
	     days[1]="Manday";
	     days[2]="Tuesday";
	     days[3]="Wedesday";
	     days[4]="Thirdays";
	     days[5]="Firday";
	     days[6]="Satarday";
	     
	     System.out.println("Week days");
	     
	     for(int i=0; i < 7; i++) {
	    	 System.out.println(i+ "  "+ days[i]);
	     }
	     
	
	     if( days[0]=="Sunday") System.out.println("Hi This is happy Sunday");
	     if( days[1]=="Manday") System.out.println("I will go to office ");
	     if( days[2]=="Tuesday") System.out.println("I will play food bal");
	     if( days[3]=="Wedesday") System.out.println("I am goin to  zim house");
	     if( days[4]=="Thirdays") System.out.println("I wil rest in home");
	     if( days[5]=="Firday") System.out.println("Hi This is happy Sunday");
	     if( days[6]=="Satarday") System.out.println("Hi This is happy Sunday");
	     
	     
	    
	    //Finding the 3x3 Matrix value
	     
	      int[][] a = new int[][]{ {3,4,5}, {4,6,8}, {9,7,6} };
	     
	      int[][] b = new int[][]{ {4,5,6}, {6,8,8}, {6,7,8} };
	    
	     
	     System.out.println("===========Matrix======a======");
	     
	     System.out.println(a[0][0]+"\t"+a[0][1]+"\t"+a[0][2]);
	     System.out.println(a[1][0]+"\t"+a[1][1]+"\t"+a[1][2]);
	     System.out.println(a[2][0]+"\t"+a[2][1]+"\t"+a[2][2]);
	     
	     
         System.out.println("===========Matrix======b======"); 
	     System.out.println(b[0][0]+"\t"+b[0][1]+"\t"+b[0][2]);
	     System.out.println(b[1][0]+"\t"+b[1][1]+"\t"+b[1][2]);
	     System.out.println(b[2][0]+"\t"+b[2][1]+"\t"+b[2][2]);
	     
	     
	     
	     // Matrix Add ( a + b);
	     System.out.println("==========(a+b) Result=====");

	     System.out.println( (a[0][0]+b[0][0]) + "\t" + (a[0][1]+b[0][1]) +"\t"+ (a[0][2]+b[0][2]) );
	     System.out.println( (a[1][0]+b[1][0]) + "\t" + (a[1][1]+b[1][1]) +"\t"+ (a[1][2]+b[1][2]) );
	     System.out.println( (a[2][0]+b[2][0]) + "\t" + (a[2][1]+b[2][1]) +"\t"+ (a[2][2]+b[2][2]) );
	     
	     
	     System.out.println("==========(axb) Result=====");

	     System.out.println( (a[0][0]*b[0][0]) + "\t" + (a[0][1]*b[0][1]) +"\t"+ (a[0][2]*b[0][2]) );
	     System.out.println( (a[1][0]*b[1][0]) + "\t" + (a[1][1]*b[1][1]) +"\t"+ (a[1][2]*b[1][2]) );
	     System.out.println( (a[2][0]*b[2][0]) + "\t" + (a[2][1]*b[2][1]) +"\t"+ (a[2][2]*b[2][2]) );
	     
	     
	       
	    
	}

}
