import java.util.Scanner;


public class Prime {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int a = scan.nextInt();
	
	System.out.println(isPrime(a));
	System.out.println(findDoublette(a));
	
}

	
	public static boolean isPrime (int a) {
	 if ( a%1==0 && a%a==0 && a%2!=0  && a%3!=0 ) {
		 System.out.println("number is prime");
		return true;
	 }else 
	 {
	System.out.println("Number is not prime");	 
	 return false;
	 }
	}
	
	
	
	public static int findDoublette(int n) {

		for(int i= n; i<Integer.MAX_VALUE; i++) {
			boolean r = isPrime(i);
			if(r) {
				int j=i+2;
				boolean r1= isPrime(j);
				if(r1) {
				return i;
				}
			}
		}
		return -1;

	}
	

	

