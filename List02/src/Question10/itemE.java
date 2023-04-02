package Question10;
import java.util.Scanner;

public class itemE {

	public static void main(String[] args) {
		int userNumber=0;
		int matrixMedium;
		Scanner scan = new Scanner(System.in);
		while(userNumber%2==0) {
			System.out.println("The number must be odd!");
			System.out.println("Enter the matrix size: ");
			userNumber=scan.nextInt();
		}
		matrixMedium=((userNumber-1)/2)+1;
		matrixMedium--;
		for(int i=0;i<userNumber;i++) {
			for(int j=0;j<userNumber;j++) {
				if(i<matrixMedium&&j<matrixMedium){
					System.out.print("#    ");
				}else if(i<matrixMedium&&j>matrixMedium) {
					System.out.print("!    ");
				}else if(i>matrixMedium&&j<matrixMedium) {
					System.out.print("*    ");
				}else if(i>matrixMedium&&j>matrixMedium) {
					System.out.print("%    ");
				}else {
					if(j==matrixMedium) {
						System.out.print("||    ");
					}else {
						System.out.print("=    ");
					}
				}
			}
			System.out.println(" ");
		}

	}

}
