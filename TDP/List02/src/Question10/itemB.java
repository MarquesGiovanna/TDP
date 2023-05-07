package Question10;
import java.util.Scanner;

public class itemB {

	public static void main(String[] args) {
		int userNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		userNumber=scan.nextInt();
		for(int i=0;i<userNumber;i++) {
			for(int j=0; j<userNumber;j++) {
				if((i+j)%2==0)
					System.out.print("@    ");
				else
					System.out.print("*    ");
			}
			System.out.println(" ");
		}

	}

}
