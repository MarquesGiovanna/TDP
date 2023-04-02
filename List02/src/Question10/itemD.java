package Question10;
import java.util.Scanner;

public class itemD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNumber;
		int count;
		System.out.println("Enter the size matrix: ");
		userNumber = scan.nextInt();
		for(int i=0;i<userNumber;i++) {
			count=userNumber-1;
			for(int j=0;j<userNumber;j++) {
				if(i==0) {
					System.out.print(j+"    ");
				}else if(i==userNumber-1) {
					System.out.print((j+count)+"    ");
					count-=2;
				}else {
					if(j==0) {
						System.out.print(i+"    ");
					}else if(j==userNumber-1) {
						System.out.print((userNumber-i-1)+"    ");
					}else {
						System.out.print("*    ");
					}
				}
			}
			System.out.println(" ");
		}

	}

}
