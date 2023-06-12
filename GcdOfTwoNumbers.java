package interviewpreparation;

public class GcdOfTwoNumbers {
	public static void main(String[]args) {
		int a=30;
		int b=40;
		int gcd=findgcd(a,b);
		System.out.println("the gcd of "+a+" and "+b+" gcd is "+gcd);
		
}

	private static int findgcd(int a, int b) {
		while(b!=0) {
			int temp=a;
			a=b;
			b=temp%a;
		}
		return a;
	}

}
