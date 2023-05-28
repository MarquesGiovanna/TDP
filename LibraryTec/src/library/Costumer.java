package library;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Costumer{
	
	public int enrollment;
	public String name;
	public double tps;
	public int donates;
	public Loan loanCostumer;
	public ArrayList<Publications> loanedPublications;
	public Boolean isStudent;
	public Boolean isTeacher;
	public Boolean isServant;
	
	public Costumer(int enrollment, String name) {
		this.enrollment=enrollment;
		this.name=name;
		this.tps=0;
		isStudent=false;
		isTeacher=false;
		isServant=false;
	}
	
	public int validatingCostumer(Costumer costumer) {
		int returne=0;
		if(costumer.isStudent==true)
			returne=1;
		else if (costumer.isServant==true)
			returne=2;
		else if(costumer.isTeacher==true)
			returne= 3;
		else 
			returne=0;
		return returne;
	}
	
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
