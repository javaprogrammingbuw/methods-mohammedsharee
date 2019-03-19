import java.util.Scanner;

public class Circle {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Radius");
		double r = scan.nextInt();
		
	System.out.println(diameter (r));
	System.out.println(area (r,3.17));
	System.out.println(circumference (r,3.17));
	}
	
	public static double diameter (double r) {
		return r*2;
	}
	
	public static double area (double r, double pi) {
	 
		return pi*r*r;
	}
	public static double circumference (double r, double pi) {
		
		return 2*pi*r;
	
	}
	
	
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.


}
