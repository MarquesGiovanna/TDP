package library;

public class Articles extends Publications{

	public Articles(String title, String autor, int year, int amount) {
		super(title, autor, year, amount);
		this.isArticle=true;
	}

}
