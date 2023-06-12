package interviewpreparation;

public class Gcd {
public static void main(String[] args) {
	int a=12;
	int b=24;
	int gcd=findgcd(a,b);
	System.out.println("the gcd of "+a+" and "+b+" is :"+gcd);
	
}

private static int findgcd(int a1, int b) {
	while(b!=0) {
		int temp=a1;
		 a1=b;
		b=temp%b;
		
		
	}
	return a1;
}
}
