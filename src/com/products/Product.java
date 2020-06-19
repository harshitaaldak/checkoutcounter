package com.products;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {		
			Scanner scanner= new Scanner(System.in);
			double totalCost=0.0 ,finalTax_A=0.0,finalTax_B=0.0;
			double Tax ,salestax_A = 0.0, salestax_B = 0.0;
			double cost_A = 0.0 ,cost_B = 0.0,cost_C=0.0;
			int items=scanner.nextInt();
		for(int i=0;i<items;i++)
		{
			double costprice = scanner.nextDouble();
		    String category=scanner.next();
				
				if(category.equals("A"))
				{
					salestax_A = costprice*0.1;
					cost_A = salestax_A +costprice+cost_A;
					finalTax_A = salestax_A+finalTax_A;
				}
				else if(category.equals("B"))
				{
					salestax_B = costprice*0.2;
					cost_B=salestax_B +costprice+cost_B;
					finalTax_B=salestax_B+finalTax_B;
				}
				else {
					cost_C=costprice+cost_C;
				}
		}				
				totalCost =cost_A +cost_B+cost_C ;
				Tax=finalTax_A+finalTax_B ;
				
				System.out.println("TOTAL COST "+totalCost);
		        System.out.println("TOTAL SALES TAX "+Tax);
		        scanner.close();
			}
	
}
