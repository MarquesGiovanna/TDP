package library;
import java.util.ArrayList;

public class Loan {
	
	
	public void makeLoanStudent(Student student, Publications publication) {
		Boolean aux = student.validatingLoan(student)==true&&publication.availableAmount>0;
		storeInfo= new RegisterLoan(student, publication);
		if(aux==true) {
			student.tps+=10*(1+student.discount(publication));
			publication.availableAmount-=1;
			publication.costumer=student;
		}else {
			System.out.println("Impossible to make the loan. Check option 6 or 7");
		}
		
	}
	
	public void makeLoanTeacher(Teacher teacher, Publications publication) {
		Boolean aux = teacher.validatingLoan(teacher)==true&&publication.availableAmount>0;
		storeInfo= new RegisterLoan(teacher, publication);
		if(aux==true&&publication.isBook==true) {
			teacher.tps+=25;
			publication.availableAmount-=1;
			listLoan.add(storeInfo);
		}else
			System.out.println("Impossible to make the loan. Check option 6 or 7");
	}
	
	public void makeLoanServant(Servant servant, Publications publication) {
		Boolean aux = servant.validatingLoan(servant)==true&&publication.availableAmount>0;
		storeInfo= new RegisterLoan(servant, publication);
		if(aux==true&&publication.isBook==true) {
			servant.tps+=15;
			publication.availableAmount-=1;
			listLoan.add(storeInfo);
		}else
			System.out.println("Impossible to make the loan. Check option 6 or 7");
	}
	
	
	public void printReportLoan(ArrayList<RegisterLoan> register) {
		for(int i=0;i<register.size();i++) {
			System.out.println(register.get(i));
		}
	}
}
