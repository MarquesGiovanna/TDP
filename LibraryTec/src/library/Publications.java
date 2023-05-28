package library;
import java.util.ArrayList;

public abstract class Publications {

	public String title;
	public String autor;
	public int publicationYear;
	public int availableAmount;
	public ArrayList<Costumer> costumers;
	public Boolean isBook;
	public Boolean isArticle;
	public Boolean isMagazine;
	
	public Publications(String title, String author, int year, int amount) {
		
		this.title=title;
		this.autor=author;
		this.publicationYear=year;
		this.availableAmount=amount;
		isBook=false;
		isArticle=false;
		isMagazine=false;
		
	}

	public int validatingPublication(Publications publication) {
		int returne=0;
		if(publication.isBook==true)
			returne=5;
		else if (publication.isArticle==true)
			returne=6;
		else if(publication.isMagazine==true)
			returne= 7;
		else 
			returne=0;
		return returne;
	};
	
	
	
	
	
	
}
