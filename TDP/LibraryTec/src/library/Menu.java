package library;

import java.util.ArrayList;

import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);

	public boolean menu(int option, ArrayList<Costumer> register, ArrayList<Publications> publication) {

		int aux;
		switch (option) {
		case 1:
			System.out.println("1 - Costumer\n2 - Publication");
			aux = scan.nextInt();
			if (aux == 1) {
				System.out.println("The costumer is:\n 1- Student\n 2- Servant\n 3- Teacher");
				costumerIs(scan.nextInt(), register);
			} else if (aux == 2) {
				System.out.println("The publication is:\n 1- Book\n 2- Article\n 3- Magazine");
				publicationIs(scan.nextInt(), publication);
			}
			return true;

		case 2:
			int enrollment;
			String publicationName;
			System.out.println("Enter the costumer's enrollment: ");
			enrollment = scan.nextInt();
			System.out.println("Enter the publication's name: ");
			publicationName = scan.toString();
			publicationName.toUpperCase();
			loan(enrollment, publicationName, register, publication);
		
		case 4:
			
			System.out.println("\nBooks:");
			for(int i=0;i<publication.size();i++) {
				Publications publi=publication.get(i);
				if(publi.isBook==true) {
					System.out.println((i+1)+" - "+publi.title+"; "+publi.publicationYear+"; "+publi.autor+"; "+publi.availableAmount);
				}
			}
			System.out.println("\nArticles:");
			for(int i=0;i<publication.size();i++) {
				Publications publi=publication.get(i);
				if(publi.isArticle==true) {
					System.out.println((i+1)+" - "+publi.title+"; "+publi.publicationYear+"; "+publi.autor+"; "+publi.availableAmount);
				}
			}
			System.out.println("\nMagazines:");
			for(int i=0;i<publication.size();i++) {
				Publications publi=publication.get(i);
				if(publi.isMagazine==true) {
					System.out.println((i+1)+" - "+publi.title+"; "+publi.publicationYear+"; "+publi.autor+"; "+publi.availableAmount);
				}
			}
			break;
		
		case 5:
			System.out.println("\nStudent:");
			for(int i=0;i<register.size();i++) {
				Costumer publi=register.get(i);
				if(publi.isStudent==true) {
					System.out.println((i+1)+" - "+publi.enrollment+"; "+publi.name+"; "+publi.tps+"; ");
				}
			}
			System.out.println("\nTeacher:");
			for(int i=0;i<register.size();i++) {
				Costumer publi=register.get(i);
				if(publi.isTeacher==true) {
					System.out.println((i+1)+" - "+publi.enrollment+"; "+publi.name+"; "+publi.tps+"; ");
				}
			}
			System.out.println("\nServant:");
			for(int i=0;i<register.size();i++) {
				Costumer publi=register.get(i);
				if(publi.isServant==true) {
					System.out.println((i+1)+" - "+publi.enrollment+"; "+publi.name+"; "+publi.tps+"; ");
				}
			}
		}
		

		return false;
	};

	private void loan(int enrollment, String publicationName, ArrayList<Costumer> register,
			ArrayList<Publications> publication) {

		int auxCostumer = 0;
		int auxPublication = 0;
		Boolean available = false;
		

		for (int i = 0; i < register.size(); i++) {
			if (register.get(i).enrollment == enrollment)
				auxCostumer = i;
			if (publication.get(i).title == publicationName && publication.get(i).availableAmount != 0)
				available = true;
				auxPublication = i;
		}
		
		
		
		
		
		
	}

	public void costumerIs(int option, ArrayList<Costumer> type) {
		int enrollment;
		String name;
		System.out.println("Enter the enrollment: ");
		enrollment = scan.nextInt();
		System.out.println("Enter the name: ");
		name = scan.toString();

		if (option == 1)
			type.add(new Student(enrollment, name));
		else if (option == 2)
			type.add(new Servant(enrollment, name));

		else if (option == 3)
			type.add(new Teacher(enrollment, name));
		else
			System.out.println("option not found! Try again");
	}

	public void publicationIs(int option, ArrayList<Publications> type) {
		String title;
		String author;
		int publicationYear;
		int amount;

		System.out.println("Enter the title: ");
		title = scan.toString();
		title.toUpperCase();
		System.out.println("Enter the author name: ");
		author = scan.toString();
		System.out.println("Enter the publication year: ");
		publicationYear = scan.nextInt();
		System.out.println("Enter the available amount: ");
		amount = scan.nextInt();

		if (option == 1)
			type.add(new Books(title, author, publicationYear, amount));
		else if (option == 2)
			type.add(new Articles(title, author, publicationYear, amount));
		else if (option == 3)
			type.add(new Magazines(title, author, publicationYear, amount));
		else
			System.out.println("option not found! Try again");
	}
}
