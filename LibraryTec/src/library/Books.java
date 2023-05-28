package library;

public class Books extends Publications {

	public Books(String title, String author, int year, int amount) {
		super(title, author, year, amount);
		this.isBook=true;
	}

}
