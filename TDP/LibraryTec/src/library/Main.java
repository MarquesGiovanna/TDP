package library;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Library library = new Library();
		Menu instructions = new Menu();
		Boolean condition = true;
		int userOpition;
		Scanner scan = new Scanner(System.in);
		
		ArrayList <Costumer> Registers=new ArrayList<>();
		Registers.add(new Student(45456,"Maria"));
		Registers.add(new Student(78877,"Ana"));
		Registers.add(new Teacher(30305,"Joao"));
		Registers.add(new Teacher(4545,"Marcos"));
		Registers.add(new Servant(78777,"Michele"));
		Registers.add(new Servant(98888,"Thales"));
		
		
		ArrayList <Publications> publicationRegisters=new ArrayList<>();
		publicationRegisters.add(new Books("Programming in JAVA", "Deitel",2022,20));
		publicationRegisters.add(new Books("How to Pass Programming Techniques", "Geovana and Caua",2023,10));
		publicationRegisters.add(new Magazines("digital inclusion necessary for today's society", "Geovana and Caua",2023,10));
		publicationRegisters.add(new Articles("A performance comparison between Java and Python", "Silva",2021,10));
		
//		ArrayList <Publications> TCCsRegisters=new ArrayList<>();
//		publicationRegisters.add(new TCCs("A performance comparison between Java and Python", "Silva",2021,10));
		
		while(condition) {
			System.out.print("Enter a number between the options:\n 1-Register\n 2-Loans\n 3-Report\n 4-Inventory listing\n 5-Costumer listing\n 6-Costumer consulte\n 7-publication consulte\n 8-Leave");
			userOpition=scan.nextInt();
			condition=instructions.menu(userOpition,Registers,publicationRegisters);
		}
		
	
		
		
	}

}
