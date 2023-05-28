package library;

import java.util.ArrayList;

public class Loan {

	public Costumer costumer;
	public Publications publication;

	public void makeLoan(Costumer costumer, Publications publication) {
		int checkUser = this.costumer.validatingCostumer(costumer);
		int checkPublication = this.publication.validatingPublication(publication);
		Boolean conditionStudent = costumer.loanedPublications.size() < 5;
		Boolean conditionServant = costumer.loanedPublications.size() < 7;
		Boolean conditionTeacher = costumer.loanedPublications.size() < 10;
		if (checkUser * checkPublication == checkPublication && conditionStudent == true) {
			costumer.tps += 10 * (1 + costumer.discount(publication));
			costumer.loanedPublications.add(publication);
			publication.costumers.add(costumer);
		} else if (checkUser * checkPublication == 2 * checkPublication && conditionTeacher == true) {
			costumer.tps += 25;
			costumer.loanedPublications.add(publication);
			publication.costumers.add(costumer);
		} else if (checkUser * checkPublication == 3 * checkPublication && conditionServant == true) {
			costumer.tps += 15;
			costumer.loanedPublications.add(publication);
			publication.costumers.add(costumer);
		} else
			System.out.println("Impossible to make the loan!");
	}

}
