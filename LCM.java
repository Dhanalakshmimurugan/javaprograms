package interviewpreparation;

public class LCM {
	public static void main(String[] args) {
		int num=7;
		int num1=12;
		 
		int lcm=(num>num1)? num :num1;

		while(true) {
			if((lcm%num==0)&&(lcm%num1==0)) {
				System.out.println(lcm);
			}
			++lcm;
			
			 
			
		}
	}

}
