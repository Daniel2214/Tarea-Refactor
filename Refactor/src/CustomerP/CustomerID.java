package CustomerP;

import java.util.Enumeration;
import java.util.Vector;

import CalculatorP.RentalCalculator;
import MoviesP.RentalSummary;
import MoviesP.MoviesManager;

public class CustomerID implements Customer{
	
	private String name;
	private Vector rentals = new Vector();

	public CustomerID( String name ) {
	    this.name = name;
	}

	@Override
	public void addRental(RentalSummary rent) {
		rentals.addElement(rent);
		
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public String getResults(){
		Enumeration numberOfRentals = this.rentals.elements();
		PrintCustomerInformation printCustomerInformation = new PrintCustomerInformation();
		double totalAmountOwned = 0;
		int frequentPoints = 0;
		
		while(numberOfRentals.hasMoreElements()){
			double amountOwned = 0;
			RentalSummary singleRental = (RentalSummary) numberOfRentals.nextElement();
			amountOwned = RentalCalculator.calculateRental(singleRental.getMovie().getPriceCode(), singleRental.getDaysRented());
			totalAmountOwned += RentalCalculator.calculateRental(singleRental.getMovie().getPriceCode(), singleRental.getDaysRented());
			frequentPoints += (checkIfBonus(singleRental))? 2 : 1;
			printCustomerInformation.addMovie(singleRental.getMovie().getTitle(), amountOwned);
			
		}
		
		
		return printCustomerInformation.printCustomerInformation(totalAmountOwned, frequentPoints);
	} 
	
	private boolean checkIfBonus(RentalSummary singleRental){
		return (singleRental.getMovie().getPriceCode() == MoviesManager.NEW_RELEASE && singleRental.getDaysRented() > 1);
	}

}