package library;

public class Servant extends Costumer{

	public Servant(int enrollment, String name) {
		super(enrollment, name);
		this.isServant=true;
	}

	public Boolean validatingLoan(Servant servant) {
		
		if(servant.loanedBooks<7&&servant.tps<50)
			return true;
		else
			return false;
	};
	
	
}
