package library;
import java.util.ArrayList;

public class Library {
	
	
	

	
	public int checkExistenceCostumer(ArrayList<Costumer> register, int enrollment) {
		int returne = -1;
		for (int i = 0; i < register.size(); i++) {
			if (register.get(i).enrollment == enrollment)
				returne = i;
		}
		return returne;
	}
	
	public int checkExistencePublication(ArrayList<Publications> register, String name) {
		int returne = -1;
		for (int i = 0; i < register.size(); i++) {
			if (register.get(i).title == name)
				returne = i;
		}
		return returne;
	}
	
	public int amountBook(ArrayList<Publications> publication) {
		int count=0;
		for(int i=0;i<publication.size();i++) {
			if(publication.get(i).isBook==true) {
				count+=1;
			}
		}
		return count;
	}
	
	public int amountArticle(ArrayList<Publications> publication) {
		int count=0;
		for(int i=0;i<publication.size();i++) {
			if(publication.get(i).isArticle==true) {
				count+=1;
			}
		}
		return count;
	}
	
	public int amountMagazine(ArrayList<Publications> publication) {
		int count=0;
		for(int i=0;i<publication.size();i++) {
			if(publication.get(i).isMagazine==true) {
				count+=1;
			}
		}
		return count;
	}

	public void loanedByTeacher(Publications publication) {
		for(int j=0;j<publication.costumers.size();j++) {
			if(publication.costumers.get(j).isTeacher==true) {
				System.out.println();
			}
		}
		
	}
	
	public void loanedByStudent(Publications publication) {
		for(int j=0;j<publication.costumers.size();j++) {
			if(publication.costumers.get(j).isStudent==true) {
				System.out.println();
			}
		}
		
	}
	
	public void loanedByServant(Publications publication) {
		for(int j=0;j<publication.costumers.size();j++) {
			if(publication.costumers.get(j).isServant==true) {
				System.out.println();
			}
		}
		
	}
	
	
}
