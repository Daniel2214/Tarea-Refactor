package CustomerP;

import java.util.Vector;

import MoviesP.Rental;

public class Customer implements CustomerMethods{
	
	private String name;
	private Vector rentals = new Vector();

	public Customer( String name ) {
	    this.name = name;
	}

	@Override
	public void addRental(Rental rent) {
		rentals.addElement(rent);
		
	}

	@Override
	public String getName() {
		return this.name;
	}

}
