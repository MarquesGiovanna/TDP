package Question06;
import java.util.Scanner;


public class Question06 {

	public static void main(String[] args) {
		int userMatrix[][]=new int [3][3];
		int transposedMatrix[][]=new int [3][3];
		boolean valid=true;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter the element ("+i+","+j+"):");
				userMatrix[i][j]=scan.nextInt();
				transposedMatrix[j][i]=userMatrix[i][j];
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(userMatrix[i][j]!=transposedMatrix[i][j])
					valid=false;
			}
		}
		if(valid==true)
			System.out.println("It's symmetrical");
		else 
			System.out.println("It's not symmetrical");
		
		
		System.out.println("matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf(userMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transposed matrix:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf(transposedMatrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
