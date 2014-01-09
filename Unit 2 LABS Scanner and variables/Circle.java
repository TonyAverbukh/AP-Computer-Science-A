//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************


import java.util.Scanner;


public class Circle
{
    public static void main(String[] args)
    {
     final double PI = 3.14159;
     
     int radius;    
	  int radius2;
	  double area;
	  double circumference2;
	  double area2;
	  double circumference;
	  double areaResult;
	  double circumferenceResult;
	  
	  
	  Scanner scan = new Scanner(System.in);
	  	  
	  
	  System.out.println("Please enter the value for the radius: ");
	  radius = scan.nextInt();
	  area = PI * radius * radius;
	  circumference = 2 * (PI * radius);


	  System.out.println("The area of a circle with radius " + radius + " is " + area);
	  System.out.println("The circumference of this circle is " + circumference);

     radius2 = 2 * radius;
     area2 = PI * radius2 * radius2;
	  circumference2 = 2 * (PI * radius2);

 	  System.out.println("The area of a circle with radius " + radius2 + " is " + area2);
	  System.out.println("The circumference of this circle is " + circumference2); 
    
 	  
	  areaResult = area2 / area;
	  circumferenceResult = circumference2 / circumference;
	  
	  
	  System.out.println("The result when you divide both of the areas' is " + areaResult);	  
	  System.out.println("The result when you divide both of the circumferences' is " + circumferenceResult);
	 
	 
	 }
}