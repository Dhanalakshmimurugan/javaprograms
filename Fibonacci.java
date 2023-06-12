package interviewpreparation;

public class Fibonacci{
	public static void main(String[] args) {
		int n1,n2;
		n1=0;
		n2=1;
	System.out.print(n1+" "+"\n"+n2+"\n");
		//System.out.println(n2);
		for(int n3=2;n3<32;n3++) {
		  n3=n1+n2;
			System.out.println(n3);
		n1=n2;
		n2=n3;

	}
	}
}
