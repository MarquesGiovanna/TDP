package library;

public class Student extends Costumer {
	

	public Student(int enrollment, String name) {
		super(enrollment, name);
		this.isStudent=true;
	}
	
	
	public Boolean validatingLoan(Student student) {
		
		if(student.loanedBooks<5&&student.tps<50)
			return true;
		else
			return false;
	};
	
	public double discount(Publications publication) {
		if(publication.isBook==true)
			return 0.1;
		else if(publication.isArticle==true)
			return 0.5;
		else if(publication.isMagazine==true)
			return 0.01;
		else
			return 0;
	}
	
	

}
