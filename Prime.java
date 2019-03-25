import java.util.Scanner;


public class Prime {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int a = scan.nextInt();
	
	System.out.println(isPrime(a));
	
}

	//Doublette missing!

	
	public static int isPrime (int a) {
	 if ( a%1==0 && a%a==0 && a%2!=0  && a%3!=0 ) {
		 System.out.println("number is prime");
		
	 }else {
	System.out.println("Number is not prime");	 
	 }
	 return a;
	 }
		
}		
		
	//todo: write a method isPrime which tells you if a given number is a prime or not
	//then, write another method findDoublette which takes an integer value as input and 
	//is looking for the first prime-doublette it findes. A prime-doublette consists of
	//two prime values with the difference of 2 (e.g. 3 and 5).
	//The function should return the smaller one of the doublette. If there exists no
	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
	//the function should return 0.
		
	

