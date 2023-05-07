package library;

import java.util.ArrayList;

public class Report {

	public Publications publi;
	public Library library;

	public void booksReport(ArrayList<Publications> publication) {
		System.out.println("\nBooks:");
		for (int i = 0; i < publication.size(); i++) {
			Publications publi = publication.get(i);
			if (publi.isBook == true)
				System.out.println((i + 1) + " - " + publi.title + "; " + publi.publicationYear + "; " + publi.autor
						+ "; " + publi.availableAmount);
		}
	}

	public void articleReport(ArrayList<Publications> publication) {
		System.out.println("\nArticles:");
		for (int i = 0; i < publication.size(); i++) {
			Publications publi = publication.get(i);
			if (publi.isArticle == true)
				System.out.println((i + 1) + " - " + publi.title + "; " + publi.publicationYear + "; " + publi.autor
						+ "; " + publi.availableAmount);
		}
	}

	public void magazinesReport(ArrayList<Publications> publication) {
		System.out.println("\nMagazines:");
		for (int i = 0; i < publication.size(); i++) {
			Publications publi = publication.get(i);
			if (publi.isMagazine == true)
				System.out.println((i + 1) + " - " + publi.title + "; " + publi.publicationYear + "; " + publi.autor
						+ "; " + publi.availableAmount);
		}
	}

	public void studentReport(ArrayList<Costumer> register) {
		System.out.println("\nStudent:");
		for (int i = 0; i < register.size(); i++) {
			Costumer publi = register.get(i);
			if (publi.isStudent == true)
				System.out.println((i + 1) + " - " + publi.enrollment + "; " + publi.name + "; " + publi.tps + "; ");
		}
	}

	public void servantReport(ArrayList<Costumer> register) {
		System.out.println("\nServant:");
		for (int i = 0; i < register.size(); i++) {
			Costumer publi = register.get(i);
			if (publi.isServant == true)
				System.out.println((i + 1) + " - " + publi.enrollment + "; " + publi.name + "; " + publi.tps + "; ");
		}
	}

	public void teacherReport(ArrayList<Costumer> register) {
		System.out.println("\nTeacher:");
		for (int i = 0; i < register.size(); i++) {
			Costumer publi = register.get(i);
			if (publi.isStudent == true)
				System.out.println((i + 1) + " - " + publi.enrollment + "; " + publi.name + "; " + publi.tps + "; ");
		}
	}

	public void costumerConsulte(Costumer costumer) {
		for (int j = 0; j < costumer.loanedPublications.size(); j++) {
			System.out
					.println("Publicações emprestadas:\n" + (j + 1) + " - " + costumer.loanedPublications.get(j).title);
		}
	}

	public void loanReportBooks(ArrayList<Publications> publication) {
		
		int amountBooks=library.amountBook(publication);
		int amountArticles=library.amountArticle(publication);
		int amountMagazines=library.amountMagazine(publication);
		for(int i=0;i<publication.size();i++) {
			if(publication.get(i).isBook==true) {
				System.out.println("\nBooks:\n Amount:"+amountBooks);
				library.loanedByTeacher(publication.get(i));
				library.loanedByStudent(publication.get(i));
				library.loanedByServant(publication.get(i));
			}
		}
			
		
	}
	

	public void loanReportArticles(ArrayList<Publications> publication) {

	}

	public void loanReportMagazines(ArrayList<Publications> publication) {

	}
}
