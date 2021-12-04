package com.controle.impl;

public class itemDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String itemName[]= new String[]{"Pen", "Pencil","book","Net","ball","Eraser","copy","ink","mobile" };
		int price[]= new int[]{50,10,30,150,350,4,30,20,4500};
		int unit[]= new int[]{2,3,4,3,6,8,9,4,2};
		
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%s \t\t %s  \t  %s   \t %s %n", "Item Name", "Price", "Unit", "Total");
		System.out.println("-------------------------------------------------------------------");
		
		int unitTotal=0;
		int gradTotal=0;
		
		for(int i=0; i<itemName.length; i++) {
			System.out.printf("%s \t\t\t  %s \t\t  %s \t\t %s%n", itemName[i], price[i], unit[i],price[i]*unit[i]);
			
			unitTotal+=unit[i];
		    gradTotal+=price[i] * unit[i];
					
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("\t\t\t Unit Total    %s  Grand Total  %s %n",unitTotal, gradTotal);

	}

}
