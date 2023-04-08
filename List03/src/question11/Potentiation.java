package question11;
import java.util.Scanner;

public class Potentiation {
	public static int empower(int base, int exponent) {
		int potency=1;
		for(int i=0;i<exponent;i++) 
			potency=potency*base;
		
		return potency;
	}

	public static void main(String[] args) {
		int base;
		int exponent;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base: ");
		base=scan.nextInt();
		System.out.println("Enter the exponent: ");
		exponent=scan.nextInt();
		System.out.println("the potentiation result is: "+empower(base,exponent));
		

	}

}
