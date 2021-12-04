package com.controle.impl;

class Computer{
	int size;
	String brand;
	String color;
}

public class CallObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		// Initialize the Object Veriables.
		 Vehicle v1 = new Vehicle();
			 v1.category="Truck";
			 v1.wheel=4;
			 v1.engine="For wheeler";
			 
		 Vehicle v2 = new Vehicle();
			 v2.category="Bike";
			 v2.wheel=2;
			 v2.engine="Two wheeler";
			 
			 
			 Computer cp = new Computer();
					 cp.size=14;
					 cp.brand="Intel Origina";
					 cp.color="Grey";
			 
			 
		 System.out.println("-----Vehicle Details------");
		 System.out.println("Category = "+ v1.category);
		 System.out.println("Wheel = "+ v1.wheel);
		 System.out.println("Engine = "+ v1.engine);
		 
		 
		 System.out.println("\n \n-----Two wheeler Details------");
		 System.out.println("Category = "+ v2.category);
		 System.out.println("Wheel = "+ v2.wheel);
		 System.out.println("Engine = "+ v2.engine);
		 
		 
			 System.out.println("\n\n-----Computer Details------");
			 System.out.println("Compute size="+ cp.size);
			 System.out.println("Compute brand="+ cp.brand);
			 System.out.println("Compute  color="+ cp.color);
		 
		 
		// methodCalculator mc= new methodCalculator();
		 //int addResult = mc.add(90, 3);
		 
		// System.out.printf("%n Adddion  value is =%d %n ",addResult);
		 
	}

}

