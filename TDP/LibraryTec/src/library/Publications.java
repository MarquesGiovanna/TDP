package library;

public abstract class Publications {

	public String title;
	public String autor;
	public int publicationYear;
	public int availableAmount;
	public Costumer costumer;
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
		
	};
	
	
	
	
	
	
}
