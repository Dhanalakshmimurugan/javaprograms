package interviewpreparation;

public class LeapYear {
	public static void main(String[] args) {
		for(int year=2000;year<=2050;year++) {
		if(year%4==0) {
			if(year%100!=0) {
			System.out.println("IT IS A LEAP YEAR "+year);
		
		}else{
			
		System.out.println("IT IS NOT A LEAP YEAR " +year );
	}}
}
}
}