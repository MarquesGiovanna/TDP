package Question10;
import java.util.Scanner;

public class itemA {

	public static void main(String[] args) {
		int userNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of columns: ");
		userNumber=scan.nextInt();
		
		for(int i=0;i<userNumber;i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+"    ");
			}
			System.out.println(" ");
		}
		

	}

}
