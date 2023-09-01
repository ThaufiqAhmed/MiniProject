package Com.YSquar.ExceptionHandling;

import java.util.Scanner;

public class PowerCalculator implements Calculator 
{

	@Override
	public double power(double a, double b) 
	{
		if(a<0 || b<0) 
		{
			throw new IllegalArgumentException("The Base or Exponent Elements Should Not In Negative Value");
		}
		
	     double value=1.0;
		
	     for (int i=0;i<b;i++) 
		{
			value =value *a;
		}
		
		return value;
	} 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base Element :");
		double a=sc.nextDouble();
		System.out.println("Enter the Exponent : ");
		double b=sc.nextDouble();
	
		PowerCalculator calculator=new PowerCalculator();
		try 
		{
			double value=calculator.power(a, b);
			System.out.println(a+" to the power of "+b+" is "+ Math.round(value));
			
		}catch(Exception e) {
			System.out.println(" Warnning : " + e.getMessage());
		}
		
		
		
	}
	
	
}
