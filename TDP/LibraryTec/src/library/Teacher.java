package library;

public class Teacher extends Costumer{

	public Teacher(int enrollment, String name) {
		super(enrollment, name);
		this.isTeacher=true;
	}
	
public Boolean validatingLoan(Teacher teacher) {
		
		if(teacher.loanedBooks<10&&teacher.tps<50)
			return true;
		else
			return false;
	};
	
}
