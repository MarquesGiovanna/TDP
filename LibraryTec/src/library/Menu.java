package library;

import java.util.ArrayList;

import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	Report report = new Report();
	Library library = new Library();
	Loan loaned = new Loan();

	public boolean menu(int option, ArrayList<Costumer> register, ArrayList<Publications> publication) {

		int aux;
		String name;
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

			return true;
		case 4:

			report.booksReport(publication);
			report.articleReport(publication);
			report.magazinesReport(publication);
			return true;

		case 5:
			report.studentReport(register);
			report.servantReport(register);
			report.teacherReport(register);
			return true;

		case 6:
			System.out.println("Enter the enrollment:");
			aux = scan.nextInt();
			int indice = library.checkExistenceCostumer(register, aux);
			if (indice != -1) {
				report.costumerConsulte(register.get(indice));
			}
			return true;

		case 7:
			System.out.println("Enter the publication title:");
			name = scan.toString();
			name.toUpperCase();
			int ind = library.checkExistencePublication(publication, name);
			System.out.println("Title: " + publication.get(ind).title + " - Author: " + publication.get(ind).autor
					+ " - Year: " + publication.get(ind).publicationYear + " - Amount: "
					+ publication.get(ind).availableAmount);

			return true;

		default:
			return false;
		}

	};

	

	private void loan(int enrollment, String publicationName, ArrayList<Costumer> register, ArrayList<Publications> publication) {
		int indiceCostumer=library.checkExistenceCostumer(register, enrollment);
		int indicePublication=library.checkExistencePublication(publication, publicationName);
		int existenceCondition = indiceCostumer+indicePublication;
		Boolean tpsCostumerOrDonate = register.get(indiceCostumer).tps%50==register.get(indiceCostumer).donates;
		Boolean availableAmoun=publication.get(indicePublication).availableAmount>0;
		if(existenceCondition>-1&&(tpsCostumerOrDonate&&availableAmoun)==true) {
			loaned.makeLoan(register.get(indiceCostumer), publication.get(indicePublication));
		}else
			System.out.println("Impossible to do loan. Chech the existence of Costumer or Publication");
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
