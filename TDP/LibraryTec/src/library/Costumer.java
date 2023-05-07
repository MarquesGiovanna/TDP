package library;

public abstract class Costumer{
	
	public int enrollment;
	public String name;
	public double tps;
	public int loanedBooks;
	public Boolean isStudent;
	public Boolean isTeacher;
	public Boolean isServant;
	
	public Costumer(int enrollment, String name) {
		this.enrollment=enrollment;
		this.name=name;
		this.tps=0;
		this.loanedBooks=0;
		isStudent=false;
		isTeacher=false;
		isServant=false;
	}
	
	
	
	
	
	
}
