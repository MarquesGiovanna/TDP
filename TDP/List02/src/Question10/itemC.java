package Question10;
import java.util.Scanner;

public class itemC {

	public static void main(String[] args) {
		
		int userNumber=0;
		
		Scanner scan = new Scanner(System.in);
		int matrixMedium;
		while(userNumber%2==0) {
			System.out.println("The number must be odd!");
			System.out.println("Enter the size matrix: ");
			userNumber=scan.nextInt();
		}
		
		matrixMedium=((userNumber-1)/2)+1;
		matrixMedium--;
		for(int i=0;i<userNumber;i++) {
			int count=userNumber;
				for(int j=0;j<userNumber;j++) {
					if(i==matrixMedium||j==matrixMedium) {
						System.out.print("@    ");
						count-=2;
					}
					else if(i%2==0) {
						System.out.print(j+"    ");
					}
					else if(i%2!=0) {
						System.out.print((j+count)+"    ");
						count-=2;
					}
					
			}
				System.out.println(" ");
			
		}

	}

}
