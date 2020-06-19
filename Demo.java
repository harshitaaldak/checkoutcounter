package com.prod2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
		{		
			Scanner scanner= new Scanner(System.in);
			double totalCost=0.0 ,finalTax_A=0.0,finalTax_B=0.0;
			double Tax =0.0;
			double cost_A = 0.0 ,cost_B = 0.0,cost_C=0.0;
			int items=scanner.nextInt();
        
		if(items<=0)
		{
			System.out.println("Invalid Input");
		   System.exit(0);
		}
		else
		{
			while(items>0)
		  {
		       double costprice = scanner.nextDouble();
		       String category=scanner.next();
				
				if(category.equals("A"))
				{
					cost_A = costprice+cost_A ;
					finalTax_A = cost_A*0.1;
				}
				else if(category.equals("B"))
				{
					cost_B = costprice+cost_B;
					finalTax_B = cost_B*0.2;
				}
				else if(category.equals("C"))
				{ 
					cost_C=costprice+cost_C ;
				}
				else
				{
					System.out.println("Invalid Input");
					System.exit(0);
				}
				
				totalCost =(cost_A+finalTax_A) +(cost_B+finalTax_B)+cost_C ;
				Tax=finalTax_A+finalTax_B;
				items--;
		}
		System.out.println("Total Amount: "+totalCost);
	    System.out.println("Total Tax : "+Tax);	
	}
 }
}
	
