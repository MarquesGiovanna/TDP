package question07;
import java.util.Scanner;

public class sortCheck {
	public static boolean checkSorting(int vector[]) {

		boolean validation=true;
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = i; j < vector.length; j++) {

				if (vector[i] > vector[j])
					validation=false;
				
			}
		}

		return validation;
	}

	public static void main(String[] args) {
			int vectorSize;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the vector size: ");
			vectorSize=scan.nextInt();
			int userVector[]=new int[vectorSize];
			for(int i=0;i<userVector.length;i++) {
				System.out.println("Enter the element " + (i + 1) + ":");
				userVector[i]=scan.nextInt();
			}
			System.out.println(checkSorting(userVector));
		
		

	}

}
