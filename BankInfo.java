package com.nabilbank.impl;
import java.util.Scanner;
public class BankInfo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub		
	   System.out.println("\t Bank Account Infomation ");
	   System.out.println("--------------------------------------- ");
	   System.out.println("| Account Name \t | Account no \t|   ");
	   System.out.println("--------------------------------------- ");
	   System.out.println("| Surendra        | 048884787584b |");
	   System.out.println("| Mahesh          | 048884787584b |");
	   System.out.println("| Krishana        | 048884787584b |");
	   System.out.println("| Yaman           | 048884787584b |");
	   System.out.println("| Surendra        | 048884787584b |");
	   System.out.println("| shrijan         | 048884787584b |");
	   System.out.println("| shirisha        | 048884787584b |");
	   System.out.println("--------------------------------------- ");
	  
	   // Veriable Declaration
	   int l = 200;
	   int b = 300;
	   int area = l*b;
	   
	   // out put 
	   System.out.println("lenght of box  l="+l);
	   System.out.println("Breath of box  b="+b);
	   System.out.println("Areay of box   ="+area);
	   
	   // Taking input from user 
	   System.out.println("--------------------------------------- ");
	   Scanner x = new Scanner(System.in);
       
	   System.out.println("Please Enter the box length");
       int le = x.nextInt(); 
        		          
       System.out.println("Please Enter the box Breath");
       int br = x.nextInt();
       
	   int a= le*br;
	   
	   System.out.println("Input box lenght is ="+le);
	   System.out.println("Input box breath is ="+br);
	   System.out.println("Area of box is  ="+a);
	   
	   	 
	}

}
